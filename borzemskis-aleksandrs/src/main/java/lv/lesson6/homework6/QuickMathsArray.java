package lv.lesson6.homework6;

import java.util.Scanner;

public class QuickMathsArray {

    public static void main(String[] args) {
        String again;

        int[] inputNumbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        do {
            for (int i = 0; i < inputNumbers.length; i++) {
                System.out.print("Please,input " + (i + 1) + " number!");
                inputNumbers[i] = scanner.nextInt();
            }

            int biggerDigit = inputNumbers[0];
            for (int inputNumber : inputNumbers) {
                if (biggerDigit < inputNumber) {
                    biggerDigit = inputNumber;
                }
            }
            System.out.println("In your input numbers the biggest number is: " + biggerDigit + " !!!");

            System.out.println("Do you want to try again? (Y/N)");
            again = scanner.next().toUpperCase();
        } while (again.equals("Y"));
    }
}
