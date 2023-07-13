package week7;

import java.util.Arrays;

public class SortDescending {
    public static int[] sortArrayDescending(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        // Perform bubble sort algorithm
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
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
        int[] arr = {10,20,7, 8, 90};
        int[] sortedNumbers = sortArrayDescending(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));
    }
}
/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */