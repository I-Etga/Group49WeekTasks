package week3;

public class PrimeNumber {
/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not.
*/


    // A prime number is a whole number greater than 1
    // that has only factors 1- and the number itself


    public static void isPrime(int number) {
        boolean isPrime = true;


        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The given number is a prime number.");
        } else {
            System.out.println("The given number is not a prime number.");
        }
    }

    public static void main(String[] args) {

        int number = -2; // Change 'number' to the desired number
        isPrime(number);
    }
}






