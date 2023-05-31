package week1;

public class DivideWithoutOperator {

    public static int divideWithoutDivisionOperator(int num1, int num2) {
        if (num1 == 0) {
            throw new ArithmeticException("The result is undefined. The number cannot be divided by 0");
        }

        int count = 0;
        while (num2 >= num1) {
            num2 -= num1;
            count++;
        }
        return count;
    }





}
/*
2-Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

 */