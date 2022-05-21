package romannumerals

abstract class ConvertFromRomanNumerals {

    //    https://en.wikipedia.org/wiki/Roman_numerals
    //    Examples numerals:
    //    I: 1
    //    V: 5
    //    X: 10
    //    L: 50
    //    C: 100
    //    D: 500
    //    M: 1000

    companion object {

        val romanNumeralsMap = mapOf(
            'M' to 1000,
            'D' to 500,
            'C' to 100,
            'L' to 50,
            'X' to 10,
            'V' to 5,
            'I' to 1
        )

        fun validateInput(input: String) {
            validateCharacters(input)
            validateInputDuplication(input)
        }

        private fun validateCharacters(input: String) {
            for (character in input) {
                if (!romanNumeralsMap.keys.contains(character)) {
                    throw IllegalArgumentException("Character is not a recognizable roman numeral")
                }
            }
        }

        private fun validateInputDuplication(input: String) {
            val nonDuplicableArguments = setOf('D', 'L', 'V')
            input.toCharArray().filter {
                nonDuplicableArguments.contains(it)
            }.size

        }

        //    EXTRA: Validate argument order
        //    - implementation does not recognize IIX as an error

        //  EXTRA: Validate input argument concatenation
        //  - implementation does not recognize IIII as an error
        //  - implementation does not recognize VV as an error
    }

    abstract fun convertFromRomanNumerals(romanNumeral: String): Int
}