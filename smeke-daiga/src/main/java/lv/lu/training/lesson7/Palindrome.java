package lv.lu.training.lesson7;

// check whether a given String is a palindrome
public class Palindrome {
    public static boolean isPalindrome(String textToCheck) {
        String textToCheckLowercase = textToCheck.toLowerCase();
        int forward = 0;
        int backward = textToCheckLowercase.length() - 1;

        while (backward > forward) {
            char forwardChar = textToCheckLowercase.charAt(forward++);
            char backwardChar = textToCheckLowercase.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}
