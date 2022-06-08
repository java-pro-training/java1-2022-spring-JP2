package lv.lu.training.lesson7;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
boolean result = Palindrome.isPalindrome(scanner.next());
        if (result){
            System.out.println("palindrome");
        }else{
            System.out.println("no palindrome");
        }

    }
}
