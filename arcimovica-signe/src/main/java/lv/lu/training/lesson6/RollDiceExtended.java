package lv.lu.training.lesson6;

import java.util.Random;

public class RollDiceExtended {

    public static void main(String[] args) {
        Random random = new Random();
        int firstDice = random.nextInt(1,6);
        int secondDice = random.nextInt(1,6);
        int diceSum = firstDice + secondDice;
        int sumOfWins = 0;
        int sumOfLoses = 0;

        while(diceSum != 12){
            if (diceSum == 7 || diceSum ==11) {
                sumOfWins++;
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLoses++;
            }
        }

        System.out.println("Vinnētas spēles: "+ sumOfWins);
        System.out.println("Zaudētas spēles: "+ sumOfLoses);
    }

}
