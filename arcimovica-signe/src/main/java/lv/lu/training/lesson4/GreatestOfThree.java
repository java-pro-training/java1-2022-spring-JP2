package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Lielākais no trīs skaitļiem ir pirmais");
        }
        else if(firstNumber < secondNumber && secondNumber > thirdNumber){
            System.out.println("Lielākais no trīs skaitļiem ir otrais");
        }
        else{
            System.out.println("Lielākais no trīs skaitļiem ir trešais");
            }
    }
}
