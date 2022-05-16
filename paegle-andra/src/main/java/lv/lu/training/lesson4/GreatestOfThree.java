package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu ievadiet pirmo skaitli: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Lūdzu ievadiet otro skaitli: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Lūdzu ievadiet trešo skaitli: ");
        int thirdNumber = scanner.nextInt();


        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("Lielākais no skaitļiem ir:" + firstNumber);
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Lielākais no skaitļiem ir:" + secondNumber);
        } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            System.out.println("Lielākais skaitlis ir:" + thirdNumber);
        } else
            System.out.println("Ievadītie skaitļi nedrīkst sakrsist, atkārtojiet!");
    }

}
