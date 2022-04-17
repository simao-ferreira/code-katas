package romannumerals

class ConvertFromRomanStandardNumerals : ConvertFromRomanNumerals() {

    // Using the improved version, apply understanding to standard version
    override fun convertFromRomanNumerals(romanNumeral: String): Int {
        validateInput(romanNumeral)
        val holder = mutableListOf<Int>()
        for (character in romanNumeral.toCharArray()) {
            if (romanNumeralsMap.containsKey(character)) {
                romanNumeralsMap[character]?.let { it -> holder.add(it) }
            }
        }
        return calculateTotal(holder)
    }

    private fun calculateTotal(values: List<Int>): Int {
        var aggregator = 0
        (0 until values.size - 1).forEach {
            if (values[it + 1] > values[it])
                aggregator -= values[it]
            else {
                aggregator += values[it]
            }
        }
        aggregator += values[values.size - 1]

        return aggregator
    }
}