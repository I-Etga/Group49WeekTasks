package week1;

public class DivideWithoutOperator {
<<<<<<< HEAD
    /*2-Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.*/

    public static int divideResult(int num1, int num2) {
        int divide = 0;
        if (num1 < 0) {
            num1 = -num1;
        } else if (num2 < 0) {
            num2 = -num2;
        }

        if (num1 >= num2) {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            while (num1 >= num2) {
                num1 -= num2;
                divide++;
            }
        } else {
            if (num1 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            while (num2 >= num1) {
                num2 -= num1;
                divide++;
            }
        }
        return divide;
    }

    public static void main(String[] args) {
        System.out.println(divideResult(22, -2));
        System.out.println(divideResult(200, 12));
        System.out.println(divideResult(22, 22));
        System.out.println(divideResult(0, -2));
    }
=======

    public static void  divisionWithoutOperator(int m, int n){


        int count = 0;
        while (m >= n) {
            m -= n;
            count++;
        }

        System.out.println(count+" with a remainder of "+m);
    }

    public static void main(String[] args) {

        divisionWithoutOperator(10,5);
        divisionWithoutOperator(8,5);

    }


>>>>>>> 836fc3a606063d726c54632b3c7cf28300d760cc
}
