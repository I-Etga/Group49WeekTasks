package week7;

import java.util.Arrays;

public class SortAscending_Array {
    /*
    Question2: Array - Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static int[] sortAscending(int[] arr) {
        // Iterate over the array length - 1 times
        for (int i = 0; i < arr.length - 1; i++) {
            // Iterate over the unsorted portion of the array
            for (int j = 0; j < arr.length - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
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
        int[] arr = {10, 9, 8, 7};
        arr = sortAscending(arr);
        System.out.println(Arrays.toString(arr)); // Output: [7, 8, 9, 10]
    }


}
