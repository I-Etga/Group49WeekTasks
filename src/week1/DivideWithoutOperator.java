package week1;

public class DivideWithoutOperator {
    public static void division(int a, int b) {

        int division = 0;
        while (a >= b) {
            a -= b;
            division++;
        }

        System.out.println("Number1 / number2 = " + division);
    }

    public static void main(String[] args) {
        division(30,2);
    }
}
/*
2-Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */
