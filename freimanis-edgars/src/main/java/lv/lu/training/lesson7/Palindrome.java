package lv.lu.training.lesson7;

import java.util.Scanner;

public class Palindrome {
    public static void main (String [] args) {
        String original ;
        StringBuilder reverse = new StringBuilder();
        Scanner word = new Scanner(System.in);
        System.out.println("Ievadiet tekstu: ");

        original = word.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse.append(original.charAt(i));
        }
        if (original.equalsIgnoreCase(reverse.toString())) { //sākotnēji vienkārši "equals", bet programma nestrādā pareizi, ja sāk vārdu ar lielo burtu
            System.out.println("Ievadītais teksts ir palindroms");
        } else {


            System.out.println("Ievadītais teksts NAV palindroms");


        }

    }

}
