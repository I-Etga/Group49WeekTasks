package week5;

public class Reverse {
    public static String reverseString(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverseString(str));

    }
}
/*
2-String -- Reverse
 Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */
