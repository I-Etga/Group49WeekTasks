package week3;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        // Check for divisibility from 2 to the square of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // Number is divisible, not prime
            }
        }

        return true; // Number is prime
    }

    public static void main(String[] args) {
        int num = 17;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}


/*
1-Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */
