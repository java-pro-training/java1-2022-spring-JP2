package lv.lu.training.lesson7.uzdevums2;

public class Palindrome {

    public static boolean isPalindrome(String text){
        String[] word = text.split("");
        for (int i = 0, j= word.length-1;i< word.length/2;i++,j--) {
            if(!word[i].equalsIgnoreCase(word[j])){
                return false;
            }
        }

        return true;
    }

}
