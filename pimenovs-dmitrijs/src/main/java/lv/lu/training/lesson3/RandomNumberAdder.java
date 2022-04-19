package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int a = randomNumberGenerator.nextInt(21);
        int b = randomNumberGenerator.nextInt(31);
        int c = randomNumberGenerator.nextInt(41);

        int result = a + b + c;

        System.out.println("Result is" + " " + result);
    }
}
