package lv.lu.training.lesson6;

import java.util.Random;

public class RollDiceWithLoop {

    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);
        int diceSum = dice1 + dice2;
        int sumOfWins = 0;
        int sumOfLosses = 0;
        int totalGames = 0;

        while (diceSum != 12) {
            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLosses++;
            }
            totalGames++;
            diceSum = random.nextInt(1, 7) + random.nextInt(1, 7);
        }
        System.out.println("You have played " + totalGames + " times");
        System.out.println("You have won " + sumOfWins + " times");
        System.out.println("You have lost " + sumOfLosses + " times");
    }
}