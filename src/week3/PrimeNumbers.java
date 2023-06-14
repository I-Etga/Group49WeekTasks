package week3;

public class PrimeNumbers {
    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        int num = 45;
        if (isPrime(45)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
/*
 Numbers -- Prime Number
Write a method that can check if a number is prime or not.
*/