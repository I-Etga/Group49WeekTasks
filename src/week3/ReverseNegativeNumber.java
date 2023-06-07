package week3;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int num) {
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
            num *= -1;  // Make the number positive for reversal
        }

        int reversedNum = 0;
        while (num > 0) {
            reversedNum = (reversedNum * 10) + (num % 10);
            num /= 10;
        }

        if (isNegative) {
            reversedNum *= -1;  // Make the number negative again
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        int input = -35;
        int reversed = reverseNegativeNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
/*
2-Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */