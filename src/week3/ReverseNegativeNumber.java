package week3;

public class ReverseNegativeNumber {

    public static int reverseNegativeNumber(int number){
        String num = Integer.toString(number).replace("-","");

        String reverseNumber ="";
        for (int i = num.length()-1; i >= 0; i--) {
            reverseNumber += num.charAt(i);
        }
        return Integer.parseInt(reverseNumber) * (-1);
    }
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-35));
    }
}
/*
2-Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */