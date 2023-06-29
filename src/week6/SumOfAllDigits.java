package week6;

public class SumOfAllDigits {

    public static int sumOfAllDigits(String sentence) {
        int total = 0;
        String[] chars = sentence.split(" ");

        for (String each : chars) {
            if (Character.isDigit(each.charAt(0))) {
                total += Integer.parseInt(each);
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String sentence = "12 java 5 apple 3";

        System.out.println(sumOfAllDigits(sentence));
    }

}
/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */