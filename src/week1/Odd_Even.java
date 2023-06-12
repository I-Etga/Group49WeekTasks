package week1;


public class Odd_Even {
/* Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"*/

    public static void main(String[] args) {
        System.out.println(oddOrEven(-4));
    }

    public static String oddOrEven(int number) {

        if (number % 2 == 0) {
            return number + " is even";
        }
        return number + " is odd";
    }


}
