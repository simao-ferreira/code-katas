import spock.lang.Specification
import spock.lang.Unroll

class MakeItAnagramTest extends Specification {

    def anagram = new MakeItAnagram()

    @Unroll
    def "Should assert #result characters are present in strings #one and #two"() {

        when:
        def quantity = anagram.minimumCharactersToAnagram(one, two)

        then:
        quantity == result

        where:
        one                    | two                              || result
        "fcrxzwscanmligyxyvym" | "jxwtrhvujlmrpdoqbisbwhmgpmeoke" || 30
        "boabad"               | "dadbod"                         || 4
    }

    @Unroll
    def "Should also assert #result characters are present in strings #one and #two"() {

        when:
        def quantity = anagram.otherMinimumCharactersToAnagram(one, two)

        then:
        quantity == result

        where:
        one                    | two                              || result
        "fcrxzwscanmligyxyvym" | "jxwtrhvujlmrpdoqbisbwhmgpmeoke" || 30
        "boabad"               | "dadbod"                         || 4
    }
}
