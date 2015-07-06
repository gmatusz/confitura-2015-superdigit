package pl.gmatusz.confitura2015.viacom;


import pl.gmatusz.confitura2015.viacom.superdigit.SuperdigitCalculator;
import pl.gmatusz.confitura2015.viacom.superdigit.impl.SuperdigitCalculatorImpl;

/**
 * Created by gmatusz on 2015-07-06.
 */
public class SuperdigitRunner {

    public static void main(String[] args) {

        SuperdigitCalculator calc = new SuperdigitCalculatorImpl();

        if (args.length == 0) {
            usage();
        } else {

            for (String argument : args) {
                try {
                    int number = Integer.parseInt(argument);
                    int result = calc.computeSuperdigit(number);

                    System.out.println("superdigit(" + number + ") = " + result);

                } catch (Exception ex) {
                    System.err.println("Exception occured:");
                    ex.printStackTrace();
                }
            }
        }
    }

    private static void usage() {
        System.err.println("usage: java -jar superdigit.jar <N1> <N2> ...");
    }
}
