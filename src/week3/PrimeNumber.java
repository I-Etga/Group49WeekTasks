package week3;

public class PrimeNumber {
<<<<<<< HEAD
    public static boolean prime(int num) {
        boolean prime = true;
        for (int i = 2; i < 10; i++) {
            if (i == num) {
                continue;
            }
            if (num % i == 0 || num == 2) {
                System.out.print(num + " Prime Number is: ");

                return !prime;
            } else {
                System.out.print(num + " Prime Number is:");
                return prime;
            }

        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(prime(123));
    }
}
=======
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
>>>>>>> 836fc3a606063d726c54632b3c7cf28300d760cc
/*
1-Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */
