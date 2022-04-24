package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        System.out.println("First number" + " " + firstNumber);
        System.out.println("Second number" + " " + secondNumber);
        System.out.println("Third number" + " " + thirdNumber);

        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("First Number is biggest");

        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Second Number is biggest");

        }else if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Third Number is biggest");

        }else{
            System.out.println("Try to choose another number");
        }
    }
}
