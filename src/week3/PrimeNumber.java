package week3;

public class PrimeNumber {
    public static void primeOrNot(int number) {
        if (number <= 1) {
            System.out.println(number + " is not prime.");
            return;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not prime.");
                return; // Number is divisible, so not prime
            }
        }

        System.out.println(number + " is prime.");
    }

    public static void main(String[] args) {
        int number = 37;
        primeOrNot(number);//37 is prime.

        number = 8;
        primeOrNot(number);//8 is not prime.
    }

}
/*
1-Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */
