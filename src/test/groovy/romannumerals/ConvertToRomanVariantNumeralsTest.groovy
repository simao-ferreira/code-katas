package romannumerals

import spock.lang.Specification
import spock.lang.Unroll

class ConvertToRomanVariantNumeralsTest extends Specification {

    def romanNumerals = new ConvertToRomanVariantNumerals()

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
        4     || 'IIII'
        6     || 'VI'
        9     || 'VIIII'
        12    || 'XII'
        14    || 'XIIII'
        39    || 'XXXVIIII'
        160   || 'CLX'
        207   || 'CCVII'
        246   || 'CCXXXXVI'
        789   || 'DCCLXXXVIIII'
        2014  || 'MMXIIII'
        2421  || 'MMCCCCXXI'
        4999  || 'MMMMDCCCCLXXXXVIIII'
    }

    @Unroll
    def 'Should throw exception for arguments non representable arguments - #input'() {

        when:
        romanNumerals.convertToRomanNumerals(input)

        then:
        thrown(IllegalArgumentException)

        where:
        input || _
        -10   || _
        0     || _
        5900  || _
    }
}