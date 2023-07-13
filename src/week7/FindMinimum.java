package week7;

public class FindMinimum {
    public static int  minNum(int[] numbers){
        int min=numbers[0];//assume that the first element is the minimum number

        for (int i = 1; i < numbers.length; i++) {//i=1,2,3,4...

            if(numbers[i]<min){//compares the element of the array with the current min number
                min=numbers[i];//replace the current min number
            }

        }

        return min;
    }

    public static void main(String[] args) {

        int[] numbers={5,4,7,9,1,2};
        System.out.println("minNum(numbers) = " + minNum(numbers));

    }


}
/*
Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */
