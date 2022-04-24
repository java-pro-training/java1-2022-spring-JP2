package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet 3 vecelus skaitļus! ");
        System.out.println("1.skaitlis:  ");
        int firstNumber = scanner.nextInt();


        System.out.println("2.skaitlis: ");
        int secondNumber = scanner.nextInt();

        System.out.println("3.skaitlis: ");
        int thirdNumber = scanner.nextInt();


        int lielakaisSkaitlis = firstNumber;

if (secondNumber > lielakaisSkaitlis){
    lielakaisSkaitlis = secondNumber;
}

if (thirdNumber > lielakaisSkaitlis){
    lielakaisSkaitlis = thirdNumber;
}
System.out.println("Lielākais skaitlis ir  " + lielakaisSkaitlis);
    }
}
