package week3;

public class PrimeNumber {
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
/*
1-Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */
