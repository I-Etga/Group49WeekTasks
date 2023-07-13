package week6;

public class FindMaximum {

    public static int maxNumber(int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(maxNumber(arr));
    }
}
/*
Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
