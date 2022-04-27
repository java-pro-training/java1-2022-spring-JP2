package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Ievadiet otro skaitli: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Ievadiet trešo skaitli: ");
        double thirdNumber = scanner.nextDouble();
        if (firstNumber > secondNumber || thirdNumber) {
            System.out.println("Lielākais skaitlis ir" + firstNumber);
        } else if (secondNumber > firstNumber || thirdNumber) {
            System.out.println("Lielākais skaitlis ir" + secondNumber);
        } else if (thirdNumber > firstNumber || secondNumber) {
            System.out.println("Lielākais skaitlis ir" + thirdNumber);
        } else {
            System.out.println("Nav rezultāta");
        }


    }
}
