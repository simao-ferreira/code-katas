package romannumerals

abstract class ConvertToRomanVariant {

    companion object {

        val variantMap = mapOf(
            1000 to "M",
            500 to "D",
            100 to "C",
            50 to "L",
            10 to "X",
            5 to "V",
            1 to "I"
        )

        fun validateInput(value: Int) {
            if (value < 0) {
                throw IllegalArgumentException("Roman numerals don't have representation for negative numbers")
            } else if (value == 0) {
                throw IllegalArgumentException("Roman numerals don't have a representation for 0, it was called nulla")
            } else if (value > 4999) {
                throw IllegalArgumentException("IRoman numerals don't have a representation for numbers larger than 4999")
            }
        }
    }

    abstract fun convertToRomanNumerals(value: Int): String

}
