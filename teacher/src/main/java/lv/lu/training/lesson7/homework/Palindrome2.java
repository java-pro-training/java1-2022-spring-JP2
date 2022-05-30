package lv.lu.training.lesson7.homework;

public class Palindrome2 {

    public static boolean isPalindrome(String text) {
        String[] chars = text.split("");
        for (int i = 0, j = chars.length - 1; i < chars.length / 2; i++, j--) {
            if (!chars[i].equalsIgnoreCase(chars[j])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("Aaabbb"));
    }

}
