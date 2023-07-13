package week7;

public class FindMinimum {
    public static int findMinimum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int minimum = array[0]; // Assume the first element is the minimum

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        int minimumNumber = findMinimum(numbers);
        System.out.println("Minimum number: " + minimumNumber);
    }
}
/*
Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */
