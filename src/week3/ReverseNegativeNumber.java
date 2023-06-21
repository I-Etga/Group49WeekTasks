package week3;

public class ReverseNegativeNumber {



/*
2-Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */

    public static int reverseNegativeNumber(int number) {
        boolean isNegative = number < 0; // Check if the number is negative
        if (isNegative) {
            number = -number; // Convert the negative number to positive
        }

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }

        if (isNegative) {
            reversedNumber = -reversedNumber; // Convert the reversed number back to negative
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = -35; // Change 'number' to the desired negative number
        int reversedNumber = reverseNegativeNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}