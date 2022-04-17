package romannumerals

import spock.lang.Specification
import spock.lang.Unroll

class ConvertToRomanStandardNumeralsTest extends Specification {

    def romanNumerals = new ConvertToRomanStandardNumerals()

    @Unroll
    def 'Should convert to standard roman numerals correctly'() {
        when:
        def numeral = romanNumerals.convertToRomanNumerals(input)

        then:
        numeral == expectedRomanNumeral

        where:
        input || expectedRomanNumeral
        1     || 'I'
        2     || 'II'
        3     || 'III'
        4     || 'IV'
        6     || 'VI'
        9     || 'IX'
        12    || 'XII'
        14    || 'XIV'
        39    || 'XXXIX'
        160   || 'CLX'
        207   || 'CCVII'
        246   || 'CCXLVI'
        789   || 'DCCLXXXIX'
        2014  || 'MMXIV'
        2421  || 'MMCDXXI'
        3999  || 'MMMCMXCIX'
    }
}
