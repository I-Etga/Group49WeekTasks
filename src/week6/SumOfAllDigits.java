package week6;

public class SumOfAllDigits {

    public static int sumOfAllDigits(String str) {
        int sum = 0;

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to its corresponding integer value
                int digit = Character.getNumericValue(ch);
                // Add the digit to the sum
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "12 java 5 apple 3";
        int sum = sumOfAllDigits(str);
        System.out.println("Sum of digits in the string: " + sum);
    }
}
/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */