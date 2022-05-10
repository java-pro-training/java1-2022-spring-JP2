package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Lūdzu, ievadi pirmo skaitli:");
        int firstNumber = scanner.nextInt();

        System.out.println ("Lūdzu, ievadi otro skaitli:");
        int secondNumber = scanner.nextInt();

        System.out.println ("Lūdzu, ievadi trešo skaitli:");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println ("Lielākais skaitlis no trim ievadītajiem ir: " + firstNumber);
        }
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println ("Lielākais skaitlis no trim ievadītajiem ir: " + secondNumber);
        }
        else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            System.out.println ("Lielākais skaitlis no trim ievadītajiem ir: " + thirdNumber);
        }
        else {
            System.out.println ("Visi ievadītie skaitļi ir vienādi.");
        }
    }
}
