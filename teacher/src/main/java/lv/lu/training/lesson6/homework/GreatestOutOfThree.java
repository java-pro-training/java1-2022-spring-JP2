package lv.lu.training.lesson6.homework;

import java.util.Scanner;

public class GreatestOutOfThree {

    private int first;
    private int second;
    private int third;
    private Scanner input;

    public GreatestOutOfThree() {
        input = new Scanner(System.in);
    }

    public void inputNumbers() {
        System.out.println("Enter first number: ");
        first = input.nextInt();
        System.out.println("Enter second number: ");
        second = input.nextInt();
        System.out.println("Enter third number: ");
        third = input.nextInt();
    }

    public int getGreatestNumber() {
        int greatestNumber;
        if (first > second && first > third) {
            greatestNumber = first;
        } else if (second > first && second > third) {
            greatestNumber = second;
        } else {
            greatestNumber = third;
        }
        return greatestNumber;
    }

    public static void main(String[] args) {
        GreatestOutOfThree greatestOutOfThree = new GreatestOutOfThree();
        greatestOutOfThree.inputNumbers();
        int greatestNumber = greatestOutOfThree.getGreatestNumber();

        System.out.println("Greatest number is " + greatestNumber);
    }

}
