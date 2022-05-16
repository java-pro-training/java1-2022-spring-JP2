package lv.lu.training.lesson6;

import java.util.Scanner;

public class OddWithin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OddNumberLookup printOddWithin = new OddNumberLookup(scanner.nextInt(), scanner.nextInt());
        int a = printOddWithin.getFrom();

        if (printOddWithin.getFrom() > printOddWithin.getTill()) {
            System.out.println("Incorrect number");
        } else {
            while (a <= printOddWithin.getTill()) {
                if (printOddWithin.isOdd(a)) {
                    System.out.println(a);
                }
                a++;
            }
        }
    }
}