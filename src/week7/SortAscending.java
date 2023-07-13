package week7;

import java.util.Arrays;

public class SortAscending {
    public static int[] sortArrayAscending(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        // Perform bubble sort algorithm
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        int[] sortedNumbers = sortArrayAscending(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));
    }

}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
