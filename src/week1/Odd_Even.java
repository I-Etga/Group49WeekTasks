package week1;

public class Odd_Even {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;

        System.out.println(OddOrEven(number1)); // Output: Odd
        System.out.println(OddOrEven(number2)); // Output: Even
    }

    public static String OddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }


   // second way of a solution:
    public static String OddEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }






}






/* Numbers -- odd & even
Write a method that can identify a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"*/


