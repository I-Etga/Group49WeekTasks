package week5;

public class Reverse {

    public static String reverseString(String input) {

        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }




    public static void main(String[] args) {

        String input = "ABCD";
        String reversedString = reverseString(input);

        System.out.println(reversedString);  // Output: DCBA
    }

}

/*
2-String -- Reverse
 Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */
