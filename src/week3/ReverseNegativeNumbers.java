package week3;

public class ReverseNegativeNumbers {

    public static int  reverseNegativeNumbers(int number){

            boolean isNegative = number < 0;

            if (isNegative) {
                number = Math.abs(number);
            }

            int reversed = 0;

            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            return isNegative ? -reversed : reversed;


    }










}
/*
 Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
*/