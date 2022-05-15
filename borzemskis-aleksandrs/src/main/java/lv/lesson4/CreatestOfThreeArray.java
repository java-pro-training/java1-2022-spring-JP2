package lv.lesson4;
import java.util.Scanner;

public class CreatestOfThreeArray {

    public static void main(String[] args) {
        CreatestOfThreeArray createstOfThreeArray = new CreatestOfThreeArray();
        Numbers inputIntegerNumber = new Numbers();
        int numberOfDigits;//This var for input number of compared digits
        String resume;//This var for playing again
        System.out.println("\nThis is program how to find max number from digits\n");

        do {
            System.out.print("Please input number of digit to compere: ");

//--Start a part the program of number of input digits--
            inputIntegerNumber.setInputNumber(inputIntegerNumber.isInputNumberIsInteger());
            numberOfDigits = inputIntegerNumber.getInputNumber();
            int[] digits = new int[numberOfDigits];//--Array digit
//--End the part the program of number of input digits--

//--Start input numbers into array digits
            for (int i = 0; i < digits.length; i++) {
                int numberForLoop = i + 1;
                System.out.print("Please input " + numberForLoop + ". number: ");

                inputIntegerNumber.setInputNumber(inputIntegerNumber.isInputNumberIsInteger());
                digits[i] = inputIntegerNumber.getInputNumber();
            }
//--End input numbers into array

//--Start to compare of entered numbers
            createstOfThreeArray.getBiggerDigit(digits);
            int printBiggerNumber = createstOfThreeArray.getBiggerDigit(digits);
//--End to compare of entered numbers
            System.out.println("In your input numbers the biggest number is: " + printBiggerNumber + " !!!");
//--Start part of program if you want to play again
            System.out.println("Do You want try again? (Y/N) ");
            Scanner scanner = new Scanner(System.in);
            resume = scanner.nextLine().toLowerCase();//--to avoid caps lock in a keyboard
        } while (resume.equals("y"));
//--End part of program if you want to play again
    }

    int getBiggerDigit(int[] array){//This is method to find bigger number in an array
        int biggerDigit = array[0];
        for (int i = 0; i < array.length; i++){
            if (biggerDigit < array[i]){
                biggerDigit = array[i];
            }
        }
        return biggerDigit;
    }

}
