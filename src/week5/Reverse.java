package week5;

import javax.print.DocFlavor;

public class Reverse {

    public static String reverse(String str) {

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return reversedStr;
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverse(str));

    }
}
/*
2-String -- Reverse
 Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */
