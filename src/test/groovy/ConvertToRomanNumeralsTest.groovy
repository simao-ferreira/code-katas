import spock.lang.Specification
import spock.lang.Unroll

class ConvertToRomanNumeralsTest extends Specification {

    def romanNumerals = new ConvertToRomanNumerals()

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
    }

    @Unroll
    def 'Should convert to variant roman numerals correctly'() {
        when:
        def numeral = romanNumerals.convertToVariantRomanNumerals(input)

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
    }

    @Unroll
    def 'Should convert to variant roman numerals improved correctly'() {
        when:
        def numeral = romanNumerals.convertToVariantRomanNumeralsImproved(input)

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
    }

}
