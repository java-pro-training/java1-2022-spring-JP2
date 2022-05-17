package lv.lu.training.lesson6;

import java.util.Scanner;

public class OddNumberLookup {

    public static void main(String[] args) {
        int numberFrom;
        int numberTo;
        int i;
        Scanner fromToScanner = new Scanner(System.in);

        System.out.println("Please enter number to start with");
        numberFrom = fromToScanner.nextInt();
        System.out.println("Please enter number to finish with");
        numberTo = fromToScanner.nextInt();

        for (i = numberFrom; i <= numberTo; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

}
