package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int firstNumber = randomNumberGenerator.nextInt();
        int secondNumber = randomNumberGenerator.nextInt();
        int thirdNumber = randomNumberGenerator.nextInt();

        System.out.println(firstNumber + secondNumber + thirdNumber);
    }
}
