package week2;

import java.util.Scanner;

public class DivisibleBy3_5_15 {
    public static void divide3_5_15(int N){

        String dividedBy15 = "";
        String dividedBy5 = "";
        String dividedBy3 = "";

        for (int i = 1; i <= N; i++) {
            if (i % 15 == 0) {
                dividedBy15 += " " + i;
            } else if (i % 3 == 0) {
                dividedBy3 += " " + i;
            } else if (i % 5 == 0) {
                dividedBy5 += " " + i;
            }

        }
        System.out.println("divided by 15: " + dividedBy15);
        System.out.println("divided by 5: " + dividedBy5);
        System.out.println("divided by 3: " + dividedBy3);
    }

    public static void main(String[] args) {
        divide3_5_15(100);
    }

}
/*
2-Numbers – Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section.
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section.
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section.
EX:
Input: 100
Output: Divisible By 15 15 30 45 60 75 90
               Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
               Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */