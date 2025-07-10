package Vvedenie;

import java.math.BigInteger;

public class Task_1_2_10 {

    public double doubleExpression (double a, double b, double c) {

        double sum = a + b;
        double d = sum;

        double epsilon = 1E-4;
        double result = Math.abs(d);

        boolean truth = true;
        boolean lie = false;

         if (result == c) {
             System.out.println("Answer: " + truth);
         } else {
             System.out.println("Answer: " + lie);
         }

        return epsilon;
    }
}
