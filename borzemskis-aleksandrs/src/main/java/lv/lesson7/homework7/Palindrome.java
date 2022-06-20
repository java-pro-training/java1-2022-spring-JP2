package lv.lesson7.homework7;

import java.util.Scanner;

public class Palindrome {
    static String inputWordToCheck() {
        //Input string word
        System.out.print("Please, input word to check for palindrome!" +
                "\nnote: Capital letters do not care for me: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().toLowerCase();
    }

    static String toGetConvertedWord(String word) {
        //A method to convert string word to string array
        String[] arrayFromInputWord = word.split("");
        String[] arrayFromInputWordConverted = ArrayUtils.reverseWord(arrayFromInputWord);
        return convertArrayToWord(arrayFromInputWordConverted);
    }

    static String convertArrayToWord(String[] array) {
        //A method to convert string array to string word
        String word = "";
        for (String s : array) {
            word += s;
        }
        return word;
    }

    static void isPalindrome(String oldWord, String newWord) {
        //Is 2 words equal
        if (oldWord.equals(newWord)) {
            System.out.println("Success! Your word '" + oldWord + "' is palindrome!");
        } else {
            System.out.println("Loose! Your word '" + oldWord + "' is not palindrome!");
        }
    }

    public static void main(String[] args) {
//        String cat = "cat";
//        char[] cArray = cat.toCharArray();//to get char array
//        System.out.println("Print cat to an array: "+ Arrays.toString(cArray));
//        String[] sArray = cat.split("");//to get String array
//        System.out.println("Print cat to an array String: "+ Arrays.toString(sArray));

        do {
            String wordToCheckForPalindrome = inputWordToCheck();
            //Input a word from the terminal
            String convertedWord = toGetConvertedWord(wordToCheckForPalindrome);
            //Converting the word
            isPalindrome(wordToCheckForPalindrome, convertedWord);
            //Check for a palindrome
        } while (ArrayUtils.doYouWantToPlayAgain());
        //Recall the programme


    }
}
