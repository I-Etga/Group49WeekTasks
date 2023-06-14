package week3;

public class ReverseNegativeNumber {

    public  static int reverseNegative(int number) {

        if (number >= 0) {
            return number; // Return positive number as is
        }

        String numberString = String.valueOf(number);
        String reversedString = "-";

        for (int i = numberString.length() - 1; i >= 1; i--) {
            reversedString += numberString.charAt(i);
        }

        return Integer.parseInt(reversedString);
    }

    public static void main(String[] args) {
        int number = -78;
        int reversedNumber = reverseNegative(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
    }

/*
2-Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */