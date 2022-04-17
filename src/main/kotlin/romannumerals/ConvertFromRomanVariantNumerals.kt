package romannumerals

class ConvertFromRomanVariantNumerals : ConvertFromRomanNumerals() {

    // Step one, define a simple - even clumsy - way to map values
    override fun convertFromRomanNumerals(romanNumeral: String): Int {

        var holder = 0

        for (numeral in romanNumeral.toCharArray()) {
            when (numeral) {
                'I' -> holder += 1
                'V' -> holder += 5
                'X' -> holder += 10
                'L' -> holder += 50
                'C' -> holder += 100
                'D' -> holder += 500
                'M' -> holder += 1000
                else -> throw IllegalArgumentException("Character $numeral is not a valid roman numeral")
            }
        }
        return holder
    }
}