package lv.lu.training.lesson6;

import java.util.Scanner;

public class OddWithin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet intervāla sākuma skaitli - ");
        int firstNumber = scanner.nextInt();

        System.out.println("Ievadiet intervāla beigu skaitli - ");
        int secondNumber = scanner.nextInt();

        int i = firstNumber;
        while (i <= secondNumber) {
            if (i % 2 == 0) {
                i++;
            }
            System.out.println("Nepāra skaitļi : " + i);
            i++;
        }
    }
}
