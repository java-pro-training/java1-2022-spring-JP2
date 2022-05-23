package lv.lu.training.lesson6.homework;

import java.util.Random;

public class DiceExtented {

    public static void main(String[] args) {
        Random random = new Random();

        int diceSum = random.nextInt(1, 7) + random.nextInt(1, 7);
        int sumOfWins = 0;
        int sumOfLoses = 0;
        int totalGames = 0;

        while (diceSum != 12) {
            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLoses++;
            }
            totalGames++;
            diceSum = random.nextInt(1, 7) + random.nextInt(1, 7);
        }

        System.out.println("Spēles kopā: " + totalGames);
        System.out.println("Vinnētas spēles: " + sumOfWins);
        System.out.println("Zaudētas spēles: " + sumOfLoses);
    }

}
