package romannumerals

class ConvertToRomanVariantNumerals : ConvertToRomanVariant() {

    override fun convertToRomanNumerals(value: Int): String {

        validateInput(value)

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
}
