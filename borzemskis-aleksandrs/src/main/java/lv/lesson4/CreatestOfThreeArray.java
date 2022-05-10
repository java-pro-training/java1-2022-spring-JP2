package lv.lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreatestOfThreeArray {

    public static void main(String[] args) {
        int numberOfDigits;//This var for input number of compared digits
        boolean tryInput;//This var for check input
        String resume;//This var for playing again
        System.out.println("\nThis is program how to find max number from digits\n");

        do {
            System.out.println("Please input number of digit to compere.");

//--Start a part the program of number of input digits--
            do {
                Scanner scanner = new Scanner(System.in);
                numberOfDigits = 1;
                tryInput = false;
                try {
                    numberOfDigits = scanner.nextInt();
                } catch (InputMismatchException exception) {//try if input is not integer
                    tryInput = true;
                    System.out.println("Please write a number");
                }
                if (numberOfDigits <= 0) {//--try if input is not less than 1
                    tryInput = true;
                    System.out.println("Please write natural number bigger than 0");
                }
            } while (tryInput);
//--End the part the program of number of input digits--

            int[] digits = new int[numberOfDigits];//--Array digit

//--Start input numbers into array digits
            for (int i = 0; i < digits.length; i++) {
                int numberForLoop = i + 1;
                System.out.println("Please input " + numberForLoop + ". number");
                //--Start to try if input symbol is not number
                do {
                    tryInput = false;
                    Scanner scanner = new Scanner(System.in);
                    try {
                        digits[i] = scanner.nextInt();
                    } catch (InputMismatchException exception) {//try if input is not integer
                        tryInput = true;
                        System.out.println("Please write a number");
                    }
                } while (tryInput);
                //--End to try if input symbol is not number
            }
//--End input numbers into array

//--Start to compare of entered numbers
            int biggerDigit = digits[0];
            for (int i = 0; i < numberOfDigits; i++) {
                if (biggerDigit < digits[i]) {
                    biggerDigit = digits[i];
                }
            }
//--End to compare of entered numbers

            System.out.println("In your input numbers the biggest number is: " + biggerDigit + " !!!");//Out of result

//--Start part of program if you want to play again
            System.out.println("Do You want try again? (Y/N) ");
            Scanner scanner = new Scanner(System.in);
            resume = scanner.nextLine().toLowerCase();//--to avoid caps lock in a keyboard
        } while (resume.equals("y"));
//--End part of program if you want to play again
    }
}
