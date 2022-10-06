package org.euler.solutions;

import java.util.ArrayList;
import java.util.List;

public class MultipliesOf3Or5 {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     *
     * Find the sum of all the multiples of 3 or 5 below 1000.
     *
     */
    public static void main(String[] args) {

        System.out.println(multiplesBelow(1000));

    }

    private static int multiplesBelow(int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                sum += i;
            }

        }
        return sum;
    }


}
