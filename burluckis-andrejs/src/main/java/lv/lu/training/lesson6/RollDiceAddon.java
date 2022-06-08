package lv.lu.training.lesson6;

import java.util.Random;

public class RollDiceAddon {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);
        int diceSum = dice1 + dice2;
        int sumOfWins = 0;
        int sumOfLoses = 0;


        while (diceSum != 12) {
            if (diceSum == 7 || diceSum == 11) {
                System.out.println("Congrats, You won!");
                sumOfWins++;
                System.out.println("Games won: " + sumOfWins);

            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                System.out.println("Sorry, You lose!");
                sumOfLoses++;
                System.out.println("Games lost: " + sumOfLoses);
            }
            diceSum = random.nextInt(1, 7) + random.nextInt(1, 7);

        }
    }
}