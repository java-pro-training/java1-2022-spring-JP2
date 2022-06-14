package lv.lu.training.lesson10;

import java.util.Scanner;

public class NullPointerExceptionExample {

    public static void main(String[] args) {
        String[] words = new String[]{"Saule", "Zeme", null, "Ezers"};
        for (String word : words) {
            if (word != null) {
                System.out.println(word + ": " + word.length());
            }
        }
    }


}
