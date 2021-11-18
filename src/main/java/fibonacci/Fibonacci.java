package fibonacci;


import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.ZERO;

@NoArgsConstructor
public class Fibonacci {
    /*
     * Consider that for all purposes the first number on the fibonacci sequence (0) corresponds to index one (1).
     */

    public BigDecimal recursive(int index) {

//        Printer.printIndex(index);
        Validation.validateInput(index);

        if (index == 1) {
            return ZERO;
        } else if (index < 4) {
            return ONE;
        } else {
            return recursive(index - 2).add(recursive(index - 1));
        }
        //Problems to consider:
        // Time taken to achieve larger numbers
        // Limitations for of integer number
        // Index starts at 1
    }

    public BigDecimal iterative(int index) {
        BigDecimal fibonacci = ZERO;

        if (index == 0) {
            return ZERO;
        }
        if (index == 1) {
            return ONE;
        } else {
            BigDecimal firstNumber = ZERO;
            BigDecimal secondNumber = ONE;
            for (int i = 2; i <= index; i++) {
                fibonacci = firstNumber.add(secondNumber);
                firstNumber = secondNumber;
                secondNumber = fibonacci;
            }
            return fibonacci;
        }
    }


}
