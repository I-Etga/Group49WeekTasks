package week1;

public class DivideWithoutOperator {

    public static void divideMethod(int number1, int number2) {

        int count = 0;
        while (number1 >= number2) {
            number1 -= number2;
            count++;
        }
        System.out.println(count + " with a remainder of " + number1);


    }




}
