package week2;


public class SwapNumbers{

    public  static void  SwapNumbers(int a, int b) {

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the numbers using addition and subtraction
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

       }

    public static void main(String[] args) {
        SwapNumbers(5,7);
    }
    }



//public static void  divisionWithoutOperator(int m, int n){
/*
1-Numbers – Swap Numbers
Swap two variables' values without using a third variable.
 */

