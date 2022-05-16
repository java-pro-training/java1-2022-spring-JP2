package lv.lesson4;
import java.util.Scanner;

public class CreatestOfThreeArray {
    public static void main(String[] args) {
        CreatestOfThreeArray createstOfThreeArray = new CreatestOfThreeArray();
        Numbers inputIntegerNumber = new Numbers();
        String doYouWantToPlayAgain;//This var for playing again
        System.out.println("\nThis is program how to find max number from digits\n");

        do {
            System.out.print("Please input number of digit to compere: ");
//--Start a part the program of number of input digits--
            int numberOfDigitsToCompere = inputIntegerNumber.isInputNumberIsInteger();
            int[] digits = new int[numberOfDigitsToCompere];//--An array of numbers
//--End the part the program of number of input digits--
//--Start input numbers into array digits--
            for (int i = 0; i < digits.length; i++) {
                System.out.print("Please input " + (i + 1) + ". number: ");
                digits[i] = inputIntegerNumber.isInputNumberIsInteger();
            }
//--End input numbers into array--
            //to compare of entered numbers
            int biggestDigitOfTheArray = createstOfThreeArray.getBiggerDigit(digits);
            System.out.println("In your input numbers the biggest number is: " +
                    biggestDigitOfTheArray + " !!!");
//--Start part of program if you want to play again--
            System.out.print("Do You want try again? (Y/N) ");
            Scanner scanner = new Scanner(System.in);
            doYouWantToPlayAgain = scanner.nextLine().toLowerCase();//--to avoid caps lock in a keyboard
        } while (doYouWantToPlayAgain.equals("y"));
//--End part of program if you want to play again--
    }

    int getBiggerDigit(int[] array) {//This is method to find the biggest number in an array
        int biggerDigit = array[0];
        for (int i = 0; i < array.length; i++) {
            if (biggerDigit < array[i]) {
                biggerDigit = array[i];
            }
        }
        return biggerDigit;
    }

}
