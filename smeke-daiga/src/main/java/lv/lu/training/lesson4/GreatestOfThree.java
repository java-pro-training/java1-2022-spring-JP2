package lv.lu.training.lesson4;

import java.util.*;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //This was a very baffling task until interned showed me how similar runs through cmd
        //And by chance I realized I can actually input those values when running...
        //Not sure if that was the meaning on how this should work

        System.out.print("Enter first number- ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number- ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number- ");
        int thirdNumber = scanner.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        //will need to think a bit if this actually works and what the most effective order of comparing things is when trying to find the largest

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber)
            System.out.println("The greatest number you entered is:" + firstNumber);
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
            System.out.println("The greatest number you entered is:" + secondNumber);
        else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber)
            System.out.println("The greatest number you entered is:" + thirdNumber);
        else
            System.out.println("Something in your logic above is faulty");

    }
}
