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
1-Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

2-Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

3-Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
- for numbers which are multiple of 3 print "FIN" instead of the number,
- for numbers which are multiple of 5, print "RA" instead of the number,
- and for numbers which are multiple o
 */