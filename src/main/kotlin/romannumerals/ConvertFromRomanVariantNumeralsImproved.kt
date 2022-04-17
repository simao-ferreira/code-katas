package romannumerals

class ConvertFromRomanVariantNumeralsImproved : ConvertFromRomanNumerals() {

    //Improve by simplifying and abstracting behaviour
    // Use a map for reduction of repetition
    override fun convertFromRomanNumerals(romanNumeral: String): Int {
        validateInput(romanNumeral)
        var holder = 0
        for (numeral in romanNumeral.toCharArray()) {
            if (romanNumeralsMap.containsKey(numeral)) {
                holder += romanNumeralsMap[numeral]!!
            }
        }
        return holder
    }
}