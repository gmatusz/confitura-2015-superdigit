package pl.gmatusz.confitura2015.viacom.superdigit.impl;

import pl.gmatusz.confitura2015.viacom.superdigit.SuperdigitCalculator;

/**
 * Superdigit computation
 * Created by gmatusz on 2015-07-06.
 */
public class SuperdigitCalculatorImpl implements SuperdigitCalculator {

    /**
     *  Mathemagical implementation of superdigit function
     *
     *  hint: (n - sum_of_digits(n) \equiv 0 (mod 9)
     *
     * @param number Non-negative integer argument
     * @return superdigit(number)
     */
    public int computeSuperdigit(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("SuperdigitCalculatorImpl.computeSuperdigit(): number argument cannot be negative!");
        } else {
            return 1 + (number-1)%9;
        }
    }
}
