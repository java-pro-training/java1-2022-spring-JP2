package lv.lu.training.lesson6;

import java.util.Scanner;

public class BigestOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int biggestNumber;

        biggestNumber = number;

        for (int i = 0; i <3; i++){

            System.out.println("Ievadiet skaitli: ");
            number = scanner.nextInt();


            if (number>biggestNumber)
                biggestNumber = number;

        }

        System.out.println("Lielākais skaitlis no 3 ir: " + biggestNumber);
    }
}
