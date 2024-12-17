package org.uni.recursion;

import java.math.BigDecimal;
import java.math.MathContext;

public class SolutionFifth {
    public BigDecimal pow(BigDecimal x, int n) {
        if (n == 0) {
            return BigDecimal.ONE;
        }
        if (x.equals(BigDecimal.ZERO)) {
            return BigDecimal.ZERO;
        }
        if (n < 0) {
            x = BigDecimal.ONE
                    .divide(x, MathContext.DECIMAL32);
            n = -n;
        }
        BigDecimal half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half
                    .multiply(half);
        } else {
            return half
                    .multiply(half)
                    .multiply(x);
        }
    }

}
