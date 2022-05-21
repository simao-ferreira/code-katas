package romannumerals

import spock.lang.Specification
import spock.lang.Unroll

class ConvertFromRomanVariantNumeralsTest extends Specification {

    def numerals = new ConvertFromRomanVariantNumerals()

    @Unroll
    def 'Should convert roman variant numeral #romanInput correctly'() {
        when:
        def romanNumeral = numerals.convertFromRomanNumerals(romanInput)

        then:
        romanNumeral == expectedNumeral

        where:
        romanInput     || expectedNumeral
        'I'            || 1
        'II'           || 2
        'III'          || 3
        'IIII'         || 4
        'VI'           || 6
        'VIIII'        || 9
        'XII'          || 12
        'XIIII'        || 14
        'XXXVIIII'     || 39
        'CLX'          || 160
        'CCVII'        || 207
        'CCXXXXVI'     || 246
        'DCCLXXXVIIII' || 789
        'MMXIIII'      || 2014
        'MMCCCCXXI'    || 2421
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
