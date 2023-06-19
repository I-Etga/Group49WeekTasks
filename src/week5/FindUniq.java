package week5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindUniq {
    public static void main(String[] args) {
        /*String - Find the unique
 Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

        String str = "AAABBBCCCDEF";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                System.out.println(currentChar);
            }
        }

    }
}