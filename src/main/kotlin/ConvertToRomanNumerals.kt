class ConvertToRomanNumerals {

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

        val variantMap = mapOf(
            1000 to "M",
            500 to "D",
            100 to "C",
            50 to "L",
            10 to "X",
            5 to "V",
            1 to "I"
        )

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

    // Build on improved version
    fun convertToRomanNumerals(value: Int): String {
        var holderPair = Pair(value, "")
        standardMap.keys.forEach {
            holderPair = reduceValue(holderPair, it, standardMap[it]!!)
        }
        return holderPair.second
    }

    // Step one, define a simple way to map values
    fun convertToVariantRomanNumerals(value: Int): String {
        var newValue = value
        var holder = ""
        while (newValue > 0) {
            if (newValue >= 1000) {
                holder += "M"
                newValue -= 1000
            } else if (newValue >= 500) {
                holder += "D"
                newValue -= 500
            } else if (newValue >= 100) {
                holder += "C"
                newValue -= 100
            } else if (newValue >= 50) {
                holder += "L"
                newValue -= 50
            } else if (newValue >= 10) {
                holder += "X"
                newValue -= 10
            } else if (newValue >= 5) {
                holder += "V"
                newValue -= 5
            } else if (newValue >= 1) {
                holder += "I"
                newValue -= 1
            }
        }
        return holder
    }

    //Step two improve by simplifying and abstracting the behaviour
    // Use a map for reduction of repetition
    fun convertToVariantRomanNumeralsImproved(value: Int): String {
        var holderPair = Pair(value, "")
        variantMap.keys.forEach {
            holderPair = variantMap[it]?.let { numeral -> reduceValue(holderPair, it, numeral) }!!
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

    //EXTRAS: Cap input to a max number - max representation possible is MMMCMXCIX
    //EXTRAS: Account for negative and zero values - roman does not have zero, nulla is used instead

}
