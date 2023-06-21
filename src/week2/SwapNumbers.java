package week2;

public class SwapNumbers {
    /*
  Numbers – Swap Numbers
Swap two variables' values without using a third variable.
   */
    public static void swapNumbers(int num1, int num2) {

        num1 = num1 + num2; // 10 + 20 = 30
        num2 = num1 - num2; // 30 - 20 = 10
        num1 = num1 - num2; // 30 - 10 = 20

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

    public static void main(String[] args) {
        swapNumbers(10, 20);
    }



}
