package lv.lu.training.lesson7;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        var chars = text.toLowerCase().toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length;  i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("Level"));
        System.out.println(isPalindrome("Sum summus mus"));
        System.out.println(isPalindrome("Radius"));
    }
}
