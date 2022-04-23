package lv.lu.training.lesson4;

import java.util.Scanner;

public class QuickMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet skaitli A...");
        int a = scanner.nextInt();

        System.out.println("Ievadiet skaitli B...");
        int b = scanner.nextInt();

        QuickMath maxNumber = new QuickMath();
        int result = maxNumber.max(a, b);

        System.out.println("Lielākais skaitlis: " + result);
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
