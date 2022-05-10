package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number!");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number!");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number!");
        int thirdNumber = scanner.nextInt();

        System.out.println("You entered numbers :" + firstNumber + ", " + secondNumber + " and " + thirdNumber);

        if (firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.println("All numbers are even!");}
        else if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("First number is the biggest of them!");}
        else if (firstNumber > secondNumber && firstNumber == thirdNumber){
            System.out.println("First and third numbers are the biggest of them!");}
        else if (firstNumber == secondNumber && firstNumber > thirdNumber){
            System.out.println("First and second numbers are the biggest of them!");}
        else if (thirdNumber > secondNumber && thirdNumber > firstNumber){
            System.out.println("Third number is the biggest of them!");}
        else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Second number is the biggest of them!");}
        else {
            System.out.println("Second and third numbers are the biggest!");}
        }
    }

