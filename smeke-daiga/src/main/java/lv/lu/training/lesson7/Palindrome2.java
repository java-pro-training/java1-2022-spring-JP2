package lv.lu.training.lesson7;

public class Palindrome2 {
    public static boolean isPalindrome(String text) {
        var chars = text.toLowerCase().toCharArray(); //String parveidots burtu masiva

        for (int i=0, j = chars.length - 1; i < chars.length/2 ;i++, j--) { // divided by 2 because have to actually check only half of the length
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("Racecarrrrrr"));
    }
}
