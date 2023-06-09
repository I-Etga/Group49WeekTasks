package week3;

import java.util.Arrays;

public class ReverseNegativeNumber {
    public static void reverse(int num) {

        num = -num;
        String str = Integer.toString(num);
        String[] arr = str.split("");

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        String reversedStr = sb.toString();

        int reverse = Integer.parseInt(reversedStr);
        reverse = -reverse;
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        reverse(-13);
    }
}
/*
2-Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */