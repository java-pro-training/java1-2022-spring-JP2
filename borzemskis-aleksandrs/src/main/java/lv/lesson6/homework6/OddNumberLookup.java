package lv.lesson6.homework6;

import java.util.Scanner;

public class OddNumberLookup {

//--A method to find odd numbers
    static boolean isOdd(int number) {
        return number % 2 != 0;
    }

//--A method to print odd numbers
    static void printOddWithin(int from, int till){
        for (int i = from; i < till; i++) {
            if (isOdd(i)){
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please,input first number! ");
        numbers.setMinNumber(scanner.nextInt());
        System.out.print("Please,input first number! ");
        numbers.setMaxNumber(scanner.nextInt());

        printOddWithin(numbers.getMinNumber(), numbers.getMaxNumber());
    }
}
