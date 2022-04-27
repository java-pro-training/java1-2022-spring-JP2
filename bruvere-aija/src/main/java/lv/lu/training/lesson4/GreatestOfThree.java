package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli:");
        int firstNumber = scanner.nextInt();

        System.out.println("Ievadiet otro skaitli:");
        int secondNumber = scanner.nextInt();

        System.out.println("Ievadiet trešo skaitli:");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Lielākais skaitlis ir:" + firstNumber);

        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Lielākais skaitlis ir:" + secondNumber);
        } else
            System.out.println("Lielākais skaitlis ir:" + thirdNumber);
    }
}
