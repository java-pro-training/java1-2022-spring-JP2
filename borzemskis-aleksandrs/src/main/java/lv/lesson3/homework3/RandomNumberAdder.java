package lv.lesson3.homework3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;

        Random randomNumberGenerator = new Random();

        int firstNumber = randomNumberGenerator.nextInt(maxNumber - minNumber + 1) + minNumber;
        int secondNumber = randomNumberGenerator.nextInt(10);
        int thirdNumber = randomNumberGenerator.nextInt(10);
        int result = firstNumber + secondNumber + thirdNumber;
        String resultAll = result + " = " + firstNumber + " + " + secondNumber + " + " + thirdNumber;

        System.out.println(result + " = " + firstNumber + " + " + secondNumber + " + " + thirdNumber);
        System.out.println("All result together:\n" + resultAll);
    }
}
