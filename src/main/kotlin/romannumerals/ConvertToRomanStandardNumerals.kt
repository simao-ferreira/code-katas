package romannumerals

class ConvertToRomanStandardNumerals {

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

        val standardMap = mapOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )
    }

    fun convertToRomanNumerals(value: Int): String {
        validateInput(value)
        var holderPair = Pair(value, "")
        standardMap.keys.forEach {
            holderPair = reduceValue(holderPair, it, standardMap[it]!!)
        }
        return holderPair.second
    }

    private fun reduceValue(
        holder: Pair<Int, String>,
        interval: Int,
        numeral: String
    ): Pair<Int, String> {
        var (holderValue, holderString) = holder

        while (holderValue >= interval) {
            holderString += numeral
            holderValue -= interval
        }
        return Pair(holderValue, holderString)
    }

    fun validateInput(value: Int) {
        if (value < 0) {
            throw IllegalArgumentException("Roman numerals don't have representation for negative numbers")
        } else if (value == 0) {
            throw IllegalArgumentException("Roman numerals don't have a representation for 0, it was called nulla")
        } else if (value > 3999) {
            throw IllegalArgumentException("IRoman numerals don't have a representation for numbers larger than 3999")
        }
    }
}
