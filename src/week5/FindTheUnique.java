package week5;

import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique {
    public static String uniqueChar(String str) {

        String result = "";
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (frequency == 1) {
                result += each;
            } else {
                continue;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(uniqueChar(str));
    }
}
/*
1-String - Find the unique
 Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */