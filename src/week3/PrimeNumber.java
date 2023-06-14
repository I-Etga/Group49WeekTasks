package week3;

public class PrimeNumber {
    public static void isPrime(int number) throws IllegalArgumentException {

        if (number <= 1) {
            throw new IllegalArgumentException("Number must be greater than 1.");
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                throw new IllegalArgumentException(number + " is not a prime number.");
            }
        }
        System.out.println(number + " is a prime number.");

    }
        public static void main(String[] args) {
            int number = 7;
            try {
                isPrime(number);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
/*
1-Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */
