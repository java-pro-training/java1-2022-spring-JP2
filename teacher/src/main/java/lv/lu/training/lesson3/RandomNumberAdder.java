package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int result = randomNumberGenerator.nextInt()
                + randomNumberGenerator.nextInt()
                + randomNumberGenerator.nextInt();

        System.out.println("Trīs patvaļīgu skaitļu summa: " + result);

        int firstNumber = randomNumberGenerator.nextInt();
        int secondNumber = randomNumberGenerator.nextInt();
        int thirdNumber = randomNumberGenerator.nextInt();

        System.out.println("Trīs patvaļīgu skaitļu summa: " + (firstNumber + secondNumber + thirdNumber));

    }


}
