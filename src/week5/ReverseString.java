package week5;

public class ReverseString {

        public static String reverse(String str) {
            StringBuilder reversed = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }

            return reversed.toString();
        }

        public static void main(String[] args) {
            String original = "ABCD";
            String reversed = reverse(original);
            System.out.println(reversed);
        }
    }

