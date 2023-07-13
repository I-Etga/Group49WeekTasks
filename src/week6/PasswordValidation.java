package week6;

import java.util.Collections;

public class PasswordValidation {

    public static boolean passwordIsValid(String password) {

        int countSpaces = 0;
        int countUppercase = 0;
        int countLowercase = 0;
        int countSpecialChar = 0;
        int countDigits = 0;


        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isSpaceChar(ch)) {
                countSpaces++;
            } else if (Character.isUpperCase(ch)) {
                countUppercase++;
            } else if (Character.isLowerCase(ch)) {
                countLowercase++;
            } else if (Character.isDigit(ch)) {
                countDigits++;
            } else {
                countSpecialChar++;
            }
        }

        return password.length() >= 6 &&
                countSpaces == 0 &&
                countUppercase > 0 &&
                countLowercase > 0 &&
                countSpecialChar > 0 &&
                countDigits > 0;
    }

    public static void main(String[] args) {
        String password = "Cydeo2023*";

        System.out.println(passwordIsValid(password));

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
