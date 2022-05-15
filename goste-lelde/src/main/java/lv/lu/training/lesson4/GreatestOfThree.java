package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet tris veselus skaitlus:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();


        if ((firstNumber>=secondNumber) && (firstNumber>=thirdNumber)){
            System.out.println("Lielakais skaitlis ir:"+ firstNumber);
        }else if ((secondNumber>=firstNumber) && (secondNumber>=thirdNumber)){
            System.out.println("Lielakais skaitlis ir:"+ secondNumber);
        }else if ((thirdNumber>=firstNumber) && (thirdNumber>=secondNumber)) {
            System.out.println("Lielakais skaitlis ir:" + thirdNumber);
        }
    }
}
