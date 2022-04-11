import spock.lang.Specification
import spock.lang.Unroll

class ConvertFromRomanNumeralsTest extends Specification {

    def numerals = new ConvertFromRomanNumerals()

    @Unroll
    def 'Should convert roman variant numeral #romanInput correctly'() {
        when:
        def romanNumeral = numerals.convertFromVariantRomanNumerals(romanInput)

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
    def 'Should convert roman variant numeral #romanInput correctly improved'() {
        when:
        def romanNumeral = numerals.convertFromVariantRomanNumeralsImproved(romanInput)

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
    }

    @Unroll
    def 'Should convert roman numeral #romanInput correctly improved'() {
        when:
        def numeral = numerals.convertFromRomanNumeralsImproved(romanInput)

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
    }
}
