package lv.lu.training.lesson6;

import java.util.Scanner;

public class biggestOfTheThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int biggestNumber;
        biggestNumber = number;

        System.out.println("Ievadi trīs dažādus skaitļus, lai noskaidrotu kurš ir visslielākais");

    for (int i = 0; i < 3; i++) {

        System.out.println("Ievadi skaitli:");
        number = scanner.nextInt();

    if (number>biggestNumber)

        biggestNumber = number;

        }

    System.out.println("Lielākais skaitlis ir: " + biggestNumber);


    }


}
