package lv.lu.training.lesson7.homework;

import java.util.Locale;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        char[] chars = loweredCharArrayOf(text);
        return isPalindrome(chars);
    }

    private static boolean isPalindrome(char[] chars) {
        for (int i = 0, j = chars.length - 1; i <= chars.length / 2; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

    private static char[] loweredCharArrayOf(String text) {
        return text.toLowerCase(Locale.ROOT)
                .toCharArray();
    }

    public static void main(String[] args) {
        assert isPalindrome("Racecar");
        assert isPalindrome("Level");
        assert isPalindrome("Sum summus mus");
        assert isPalindrome("akka");
        assert !isPalindrome("Draugs");
        assert !isPalindrome("Zeme");
    }


}
