package week4;

import java.util.Arrays;

public class SameLetters {
    public static boolean same(String str1, String str2) {
        // Convert both strings to lowercase for case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to char arrays and sort them
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        // Compare the sorted char arrays
        return Arrays.equals(str1Array, str2Array);

    }
}



//String -- Same letters
//Write a return method that checks
// if a string is build out of the same letters as another string.
//Ex: same("abc", "cab"); -> true
//same("abc", "abb"); -> false: