package pl.gmatusz.confitura2015.viacom.superdigit;

import org.junit.Before;
import org.junit.Test;
import pl.gmatusz.confitura2015.viacom.superdigit.impl.SuperdigitCalculatorImpl;

import static org.junit.Assert.assertEquals;


/**
 * Created by gmatusz on 2015-07-06.
 */
public class SuperdigitCalculatorNegativeInputTest {

    SuperdigitCalculator calculator;

    @Before
    public void setUp() {
        calculator = new SuperdigitCalculatorImpl();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        calculator.computeSuperdigit(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput2() {
        calculator.computeSuperdigit(Integer.MIN_VALUE);
    }

}
