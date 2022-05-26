package lv.lu.training.lesson7;

import java.util.Scanner;

public class ArraysUtils {
    public static void main (String [] args) {
        String original ;
        StringBuilder reverse = new StringBuilder();
        Scanner word = new Scanner(System.in);
        System.out.println("Ievadiet tekstu vai skaitļu virkni ");
        original = word.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse.append(original.charAt(i)); //reverse = reverse + original.charAt(i); programma piedāvā konvertēt uz StrinBuilder
            if (i==0)
            System.out.print("apgrieztā secībā :" + reverse);
        }
    }
}
