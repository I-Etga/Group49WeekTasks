package week1;

public class Odd_Even {

    public static String identifyOddOrEven(int number) {

        String result = "";

        if (number != 0) {

            if (number % 2 == 0) {
                result = "Even";
            } else {
                result = "Odd";
            }
        } else {
            result = "Undefined";
        }

        return result;
    }

}
//





/* Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"*/