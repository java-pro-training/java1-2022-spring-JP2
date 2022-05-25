package lv.lu.training.lesson7;

public class Palindrome {

    public static boolean isPalindrome (String word){
        String checkWord = word.toLowerCase();
        int j;
        int k;

        for (j=word.length()-1,k=0;j>0;j--,k++){
            char firstLetter = checkWord.charAt(k);
            char lastLetter = checkWord.charAt(j);

            if(firstLetter != lastLetter)
            return false;
            }
        return true;
        }
    }

