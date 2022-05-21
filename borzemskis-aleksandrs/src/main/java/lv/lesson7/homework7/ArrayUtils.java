package lv.lesson7.homework7;

import java.util.Scanner;

public class ArrayUtils {
    static int[] reverse(int[] array){
        int[] result = new int[array.length];
        int j;
        for (int i = 0; i < array.length; i++){
            j = array.length - i -1;
            result[i] = array[j];
        }
        return result;
    }

    static String[] reverseWord(String[] array){
        String[] result = new String[array.length];
        int j;
        for (int i = 0; i < array.length; i++){
            j = array.length - i -1;
            result[i] = array[j];
        }
        return result;
    }
    static boolean doYouWantToPlayAgain(){
        System.out.print("Do You want to try input another word? (Y/N) ");
        Scanner scanner = new Scanner(System.in);
        String doYouWantToPlayAgain = scanner.nextLine().toLowerCase();//--to avoid caps lock in a keyboard
        return doYouWantToPlayAgain.equals("y");
    }

}
