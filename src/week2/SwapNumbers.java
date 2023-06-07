package week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 40;
        int b = 60;

        //before swapping
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping the values without a third variable
        a = a + b; // a = 40 + 60 = 100
        b = a - b; // b = 100 - 60 = 40 (b is assigned to first value of a)
        a = a - b; // a = 100 -40 = 60 (a is assigned to first value of b)

        //after swapping
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
1-Numbers – Swap Numbers
Swap two variables' values without using a third variable.
 */