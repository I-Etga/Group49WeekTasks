package week5;

public class FindTheUnique {
    public static String findUniqueCharacters(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < input.length(); j++) {
                if (i != j && currentChar == input.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String uniqueCharacters = findUniqueCharacters(input);
        System.out.println(uniqueCharacters);
    }
}
/*
1-String - Find the unique
 Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */