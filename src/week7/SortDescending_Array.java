package week7;

import java.util.Arrays;

public class SortDescending_Array {

    /*
    Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static int[] sortDescending(int[] arr) {
        // Iterate over the array length - 1 times
        for (int i = 0; i < arr.length - 1; i++) {
            // Compare each element with the subsequent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // If the current element is less than the next element, swap them
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Return the sorted array
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = sortDescending(arr);
        System.out.println(Arrays.toString(arr)); // Output: [90, 20, 10, 8, 7]
    }
}
