package lv.lu.training.lesson6;

import java.util.Random;

public class RollDiceAddition {
    public static void main(String[] args) {
        Random random = new Random();
        int sumOfWins = 0;
        int sumOfLosses = 0;
        int sumOfDices = 0;
        int totalRolls = 0;

        while (sumOfDices != 12) {
            sumOfDices=random.nextInt(1,7)+random.nextInt(1,7);
            if (sumOfDices == 7 || sumOfDices == 11) {
                sumOfWins++;
            } else if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 6) {
                sumOfLosses++;
            } else {

            }
            totalRolls++;

        }
        System.out.println("Played: "+ totalRolls+ " "+"Wins: "+sumOfWins+" "+"Losses: "+sumOfLosses);
    }
}

