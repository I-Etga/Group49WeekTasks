package week1;

public class DivideWithoutOperator {

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


}



/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */
