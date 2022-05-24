package lv.lu.training.lesson7;

public class PalindromeTest {

    public static void main(String[] args) {

            /*Tā kā metode “isPalindrome” ir statiska, tad mēs varam to izsaukt bez objekta veidošanas.
             Izsaucam to klases PalindromeTest metodē “main” un rezultātu ievietojam mainīgajā “result”*/
        boolean result = Palindrome.isPalindrome("Sum summus muss");

        System.out.print("Testējam klases Palindrome metodi 'isPalindrome', darbojas ..");
        if (result == true) {
            System.out.println("IS A PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }
    }
}
