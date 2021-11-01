import kotlin.math.abs

//Source for exercise: https://www.hackerrank.com/challenges/make-it-anagram-mglines/problem

class MakeItAnagram {
    fun minimumCharactersToAnagram(a: String, b: String): Int {
        val characterMap = mutableMapOf<Char, Int>()

        a.forEach { characterMap[it] = (characterMap[it] ?: 0) + 1 }
        b.forEach { characterMap[it] = (characterMap[it] ?: 0) - 1 }

        return characterMap.values.reduce { acc, i -> acc + abs(i) }
    }

    fun otherMinimumCharactersToAnagram(a: String, b: String): Int {
        val characterMap = mutableMapOf<Char, Int>()

        a.forEach {
            characterMap[it] = characterMap.getOrDefault(it, 0) + 1
        }
        b.forEach {
            characterMap[it] = characterMap.getOrDefault(it, 0) - 1
        }

        return characterMap.values.reduce { acc, i -> acc + abs(i) }
    }
}