package lv.lu.training.lesson7;

import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word");
boolean result = Palindrome.isPalindrome(scanner.next().toLowerCase());

if (result){
    System.out.println("Word is Palindrome");
}else{
    System.out.println("Word not Palindrome");
}
    }
}
