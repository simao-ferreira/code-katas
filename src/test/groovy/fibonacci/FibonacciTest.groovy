package fibonacci

import spock.lang.Specification
import spock.lang.Unroll

class FibonacciTest extends Specification {
    def fibonacci = new Fibonacci()

    @Unroll
    def "Should assert recursive result is correct"() {
        // Consider for this case number 0 starts at index 1
        when:
        def output = fibonacci.recursive(input)
        then:
        output == expected
        where:
        input || expected
        5     || 3
        10    || 34
    }

    @Unroll
    def "Should assert iterative result is correct"() {
        when:
        def output = fibonacci.iterative(input)
        then:
        output == expected
        where:
        input || expected
        2     || 1
        5     || 5
        10    || 55
    }
}
