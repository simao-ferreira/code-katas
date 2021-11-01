import spock.lang.Specification
import spock.lang.Unroll

class ValidParenthesisTest extends Specification {

    def validParenthesis = new ValidParenthesis()

    @Unroll
    def "Should assert response to string #input is #validity"() {

        when:
        def result = validParenthesis.hasValidParenthesis(input)

        then:
        validity == result

        where:
        input                    || validity
        "{ab([c{(d)}ef])ghijkl}" || true
        "[ba[)cdef]ghijkl]"      || false
        "[ba[)cd(ef]ghijkl]"     || false
        "[{[ba[)cd(ef]ghijkl]}]" || false
        "{}[]()"                 || true
        "([{}])"                 || true
        "(){}}{"                 || false
    }
}
