package week7;

public class FindMinimum {

    /*
    Question1: Array - Find Minimum
    Write a method that can find the minimum number from an int Array
     */

    public static int minNumber(int[] numbers) {
        int min = numbers[0]; // Assume the first element is the minimum number

        for (int i = 0; i < numbers.length - 1; i++) { //Then, we iterate through the array starting from the second element (i = 0).
            if (min > numbers[i]) { //compares each element of the array 1 by 1 if it is greater than max number
                min = numbers[i]; // Update min if a smaller number is found, it will replace the current max
            }
        }

        return min; // Return the minimum number
    }

    public static void main(String[] args) {
        int[] numbers = {100, 20, 500, 40, -10, 30};
        int min = minNumber(numbers);
        System.out.println("min = " + min); // Output: min = -10
    }








}
