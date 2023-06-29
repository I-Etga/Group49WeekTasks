package week6;

public class FindMaximum {

    public static int findMaxNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }

        int maxNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int maxNumber = findMaxNumber(arr);
        System.out.println("Maximum number: " + maxNumber);
    }





}
/*
Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
