package romannumerals

import spock.lang.Specification
import spock.lang.Unroll

class ConvertFromRomanStandardNumeralsTest extends Specification {

    def numerals = new ConvertFromRomanStandardNumerals()

    @Unroll
    def 'Should convert roman numeral #romanInput correctly'() {
        when:
        def numeral = numerals.convertFromRomanNumerals(romanInput)

        then:
        numeral == expectedNumeral

        where:
        romanInput  || expectedNumeral
        'I'         || 1
        'II'        || 2
        'III'       || 3
        'IV'        || 4
        'VI'        || 6
        'IX'        || 9
        'XII'       || 12
        'XIV'       || 14
        'XXXIX'     || 39
        'CLX'       || 160
        'CCVII'     || 207
        'CCXLVI'    || 246
        'DCCLXXXIX' || 789
        'MMXIV'     || 2014
        'MMCDXXI'   || 2421
        'MMMCMXCIX' || 3999
    }

    @Unroll
    def 'Should throw an exception if character is not a roman numeral - #romanInput'() {
        when:
        numerals.convertFromRomanNumerals(romanInput)

        then:

        thrown(IllegalArgumentException)

        where:
        romanInput || _
        'F'        || _
        'DCLIIB'   || _
        'xVi'      || _
    }

    @Unroll
    def 'Should throw an exception if character is duplicated - #romanInput'() {
        when:
        numerals.convertFromRomanNumerals(romanInput)

        then:

        thrown(IllegalArgumentException)

        where:
        romanInput || _
        'VV'       || _
        'LL'       || _
        'DD'       || _
        'XXVIV'    || _
        'XXVV'     || _
    }
}
