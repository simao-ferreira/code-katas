import spock.lang.Specification
import spock.lang.Unroll

class MakeItAnagramJavaTest extends Specification {

    def anagram = new MakeItAnagramJava()

    @Unroll
    def "Should assert #result characters are present in strings #one and #two"() {

        when:
        def quantity = anagram.minimumRemovalsToAnagram(one, two)

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
        def quantity = anagram.anotherMinimumRemovalsToAnagram(one, two)

        then:
        quantity == result

        where:
        one                    | two                              || result
        "fcrxzwscanmligyxyvym" | "jxwtrhvujlmrpdoqbisbwhmgpmeoke" || 30
        "boabad"               | "dadbod"                         || 4
    }
}
