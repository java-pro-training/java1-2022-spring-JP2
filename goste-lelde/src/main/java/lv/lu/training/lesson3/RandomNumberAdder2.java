package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder2 {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

//ar trīs mainīgajiem - katram patvaļīgajam skaitlim
        int firstNumber = randomNumberGenerator.nextInt();
        int secondNumber = randomNumberGenerator.nextInt();
        int thirdNumber = randomNumberGenerator.nextInt();

        System.out.println("Trīs patvaļīgu skaitļu summa ir: " + (firstNumber+secondNumber+thirdNumber));


//ar vienu rezultāta mainīgo
        int result = randomNumberGenerator.nextInt()
                + randomNumberGenerator.nextInt()
                + randomNumberGenerator.nextInt();

        System.out.println("Trīs patvaļīgu skaitļu summa ir: " + result);
    }
}
