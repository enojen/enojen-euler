package org.euler.solutions;


public class LargestPalindromeProduct {
    /**
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) {

        System.out.println(largestPalindromeProduct(3));
    }

    private static int largestPalindromeProduct(int digit) {
        double largestNumber = Math.pow(10, digit) - 1;
        double smallestNumber = Math.pow(10, (digit - 1));
        int largestPalindrome = 0;

        for (int i = (int) largestNumber; i > smallestNumber; i--) {
            for (int j = i; j > smallestNumber; j--) {
                int number = i * j;
                if (isPalindrome(number) && number > largestPalindrome) {
                    largestPalindrome = number;
                    if (j > smallestNumber) {
                        smallestNumber = j;
                    }
                    break;
                }
            }
        }
        return largestPalindrome;
    }

    private static boolean isPalindrome(int number) {
        int tempReversed = reverseNumber(number);
        return tempReversed == number;
    }

    private static int reverseNumber(int number) {
        int tempReversed = 0;
        while (number > 0) {
            int extractedNumber = number % 10;
            tempReversed = (tempReversed * 10) + extractedNumber;
            number = number / 10;
        }
        return tempReversed;
    }
}
