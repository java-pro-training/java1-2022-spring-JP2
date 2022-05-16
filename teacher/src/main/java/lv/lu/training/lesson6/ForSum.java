package lv.lu.training.lesson6;

import java.util.Scanner;

public class ForSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int sum = 0;
        for (int i = limit; i > 0; i--) {
            sum += i;
        }

        System.out.println("Summa ir " + sum);
    }

}
