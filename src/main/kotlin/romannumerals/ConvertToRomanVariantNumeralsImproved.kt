package romannumerals

class ConvertToRomanVariantNumeralsImproved : ConvertToRomanVariant() {

    override fun convertToRomanNumerals(value: Int): String {
        validateInput(value)
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
}
