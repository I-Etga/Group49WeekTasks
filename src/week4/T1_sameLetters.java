package week4;

import java.util.Arrays;

public class T1_sameLetters {
    public static boolean checkSameLetters(String str1, String str2) {
        // Convert both strings to lowercase for case-insensitive comparison
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        // Convert the strings to char arrays and sort them
        char[] charArray1 = lowerStr1.toCharArray();
        char[] charArray2 = lowerStr2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        boolean result = checkSameLetters(str1, str2);
        System.out.println(result); // Output: true

        String str3 = "abc";
        String str4 = "abb";
        result = checkSameLetters(str3, str4);
        System.out.println(result); // Output: false
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
