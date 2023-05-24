package week1;

public class Odd_Even {
/* Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"*/


    public static String identify(int number) {


        if (number <= 0) {
            System.err.println("Number can not be zero or negative");
            System.exit(1);
        }

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";

        }

    }

    public static void main(String[] args) {

        System.out.println("Given number is " + identify(3));


    }

}
