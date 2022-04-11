class ConvertFromRomanNumerals {

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
            'M' to 1000,
            'D' to 500,
            'C' to 100,
            'L' to 50,
            'X' to 10,
            'V' to 5,
            'I' to 1
        )
    }

    fun convertFromVariantRomanNumerals(romanNumeral: String): Int {

        var holder = 0

        for (numeral in romanNumeral.toCharArray()) {
            print(numeral)
            if (numeral == 'I') {
                holder += 1
            }
            if (numeral == 'V') {
                holder += 5
            }
            if (numeral == 'X') {
                holder += 10
            }
            if (numeral == 'L') {
                holder += 50
            }
            if (numeral == 'C') {
                holder += 100
            }
            if (numeral == 'D') {
                holder += 500
            }
            if (numeral == 'M') {
                holder += 1000
            }
        }
        return holder
    }

    fun convertFromVariantRomanNumeralsImproved(romanNumeral: String): Int {
        var holder = 0
        for (numeral in romanNumeral.toCharArray()) {
            if (variantMap.containsKey(numeral)) {
                holder += variantMap[numeral]!!
            }
        }
        return holder
    }

    fun convertFromRomanNumerals(romanNumeral: String): Int {

        val holder = mutableListOf<Int>()

        romanNumeral.toCharArray().forEach {
            if (it == 'I') {
                holder.add(1)
            }
            if (it == 'V') {
                holder.add(5)
            }
            if (it == 'X') {
                holder.add(10)
            }
            if (it == 'L') {
                holder.add(50)
            }
            if (it == 'C') {
                holder.add(100)
            }
            if (it == 'D') {
                holder.add(500)
            }
            if (it == 'M') {
                holder.add(1000)
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

    fun convertFromRomanNumeralsImproved(romanNumeral: String): Int {

        val holder = mutableListOf<Int>()
        for (numeral in romanNumeral.toCharArray()) {
            if (variantMap.containsKey(numeral)) {
                holder += variantMap[numeral]!!
            }
        }
        return calculateTotal(holder)
    }

}