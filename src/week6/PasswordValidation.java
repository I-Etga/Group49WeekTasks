package week6;

public class PasswordValidation {

    public static boolean isValidPassword(String password) {
        // Check the length and space constraint
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        // Iterate over each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        // Check if all the required conditions are met
        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
    }

    public static void main(String[] args) {
        String password = "Example@123";
        if (isValidPassword(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }
}
/*
String_PasswordValidation
Write a return method that can verify if a password is valid or not.
requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */
