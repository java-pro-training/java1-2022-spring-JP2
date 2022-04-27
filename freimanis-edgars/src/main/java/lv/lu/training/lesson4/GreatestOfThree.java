package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli - ");
        int firstNumber = scanner.nextInt();

        System.out.println("Ievadiet otro skaitli - ");
        int secondNumber = scanner.nextInt();

        System.out.println("Ievadiet trešo skaitli - ");
        int thirdNumber = scanner.nextInt();

        GreatestOfThree maxNumber = new GreatestOfThree();
        int result = maxNumber.high(firstNumber, secondNumber, thirdNumber);


        System.out.println("Lielākais skaitlis  - " + result);
    }

    public int high(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > thirdNumber && secondNumber>firstNumber) {
            return secondNumber;
        } else {
            return thirdNumber;


        }

    }

}
