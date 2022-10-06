package org.euler.solutions;

import java.util.Date;

public class LargestPrimeFactor {
    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     */

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
        System.out.println(simpleSolution(45));

    }

    private static long largestPrimeFactor(long givenNumber) {
        long largestPrimeNumber = 2;

        if (givenNumber <= 2) {
            return largestPrimeNumber;
        }

        //prime number cannot be even
        for (long i = 3; i <= givenNumber; i += 2) {
            if (isPrime(i)) {
                if (isDivisible(givenNumber, i)) {
                    System.out.println("is divisible for: " + i);
                    givenNumber = divideNumber(givenNumber, i);
                    largestPrimeNumber = i;
                    if (givenNumber == 1) {
                        return largestPrimeNumber;
                    }
                }

            }

        }
        return largestPrimeNumber;

    }

    private static boolean isDivisible(long number, long divisor) {
        return number % divisor == 0;
    }

    private static long divideNumber(long number, long divisor) {
        boolean flag = isDivisible(number, divisor);
        while (flag) {
            number /= divisor;
            flag = isDivisible(number, divisor);
        }
        return number;
    }

    private static boolean isPrime(long number) {
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int simpleSolution(long number) {

        int i;
        long copyOfInput = number;
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }

        return i;
    }


}
