package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number!");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number!");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number!");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + "ir lielākais!");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + "ir lielākais!");
        } else {
            System.out.println(thirdNumber + " ir lielākais!");
        }
    }
}