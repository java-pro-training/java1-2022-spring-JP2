package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main (String[] args) {
        Random randomNumberGenerator = new Random();

        int numberOne = randomNumberGenerator.nextInt();
        int numberTwo = randomNumberGenerator.nextInt();
        int numberThree = randomNumberGenerator.nextInt();

        int result = (numberOne + numberTwo + numberThree);

        System.out.println("The sum of three randomly generated numbers is: " + result);

    }
}
