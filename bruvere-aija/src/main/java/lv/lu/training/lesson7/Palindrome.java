package lv.lu.training.lesson7;

public class Palindrome {
    public static boolean isPalindrome(String text){
        char[] chars = loweredCharArrayOf(text);
        return isPalindrome(chars);
    }

    private static char[] loweredCharArrayOf(String text) {
        return new char[0];
    };
    private static boolean isPalindrome(char[] chars){
        for (int i =0, j = chars.length - 1; i<= chars.length/2; i++, j--){
            if (chars[i]!= chars[j]){
                return false;
            }
        }
        return true;
    }
}

