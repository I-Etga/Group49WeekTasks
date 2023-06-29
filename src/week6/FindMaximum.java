package week6;

import java.util.Arrays;

public class FindMaximum {

    //#1. Approach
    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }

        Arrays.sort(arr); // Sort the array in ascending order
        return arr[arr.length - 1]; // The last element will be the maximum
    }


    public static void main(String[] args) {
        int[] arr ={99, 12, 23, 32, 44, 57, 6};
        int maxNumber = findMaximum(arr);
        System.out.println("Maximum number: " + maxNumber);
    }
}
/*
Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
