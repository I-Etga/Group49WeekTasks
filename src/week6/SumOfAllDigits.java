package week6;

public class SumOfAllDigits {


    public static int calculateDigitSum(String input) {
        int sum = 0;
        int currentNumber = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } else {
                sum += currentNumber;
                currentNumber = 0;
            }
        }

        sum += currentNumber;

        return sum;
    }

    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        int sum = calculateDigitSum(input);
        System.out.println("Sum of digits: " + sum);
    }


}
/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */