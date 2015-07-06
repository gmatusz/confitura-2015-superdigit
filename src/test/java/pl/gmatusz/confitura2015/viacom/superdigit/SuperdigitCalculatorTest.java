package pl.gmatusz.confitura2015.viacom.superdigit;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import pl.gmatusz.confitura2015.viacom.superdigit.impl.SuperdigitCalculatorImpl;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


/**
 * Created by gmatusz on 2015-07-06.
 */
@RunWith(value = Parameterized.class)
public class SuperdigitCalculatorTest {

    SuperdigitCalculator calculator;

    private int number, result;

    public SuperdigitCalculatorTest(int number, int result) {
        this.number = number;
        this.result = result;
    }

    @Before
    public void setUp() {
        calculator = new SuperdigitCalculatorImpl();
    }


    @Parameters(name = "{index}: computeSuperdigit({0})={1}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 1},
                {2, 2},
                {10, 1},
                {100, 1},
                {101, 2},
                {Integer.MAX_VALUE, 1} //superdigit(2,147,483,647) = superdigit(46)=1
        });
    }

    @Test
    public void test_compute() {
        assertEquals(result,calculator.computeSuperdigit(number));
    }

}
