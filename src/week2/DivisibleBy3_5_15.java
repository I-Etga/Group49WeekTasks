package week2;

import java.util.Scanner;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        String divisible15 = "";
        String divisible5 = "";
        String divisible3 = "";

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                divisible15 += i + " ";
            }
            if (i % 5 == 0) {
                divisible5 += i + " ";
            }
            if (i % 3 == 0) {
                divisible3 += i + " ";
            }
        }
        System.out.println("Divisible By 15: " + divisible15.trim());
        System.out.println("Divisible By 5 : " + divisible5.trim());
        System.out.println("Divisible By 3 : " + divisible3.trim());
        input.close();

    }

}
/*
Numbers – Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibleBy15 section.
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3 section.
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in Divisible5 section.
EX:
Input: 100
Output: Divisible By 15 15 30 45 60 75 90
               Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
               Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */

