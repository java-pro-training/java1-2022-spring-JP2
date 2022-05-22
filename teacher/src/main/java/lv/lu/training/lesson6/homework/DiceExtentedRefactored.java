package lv.lu.training.lesson6.homework;

import java.util.Random;

public class DiceExtentedRefactored {

    private int diceSum;
    private int sumOfWins;
    private int sumOfLoses;
    private int totalGames;

    private final Random random;

    public DiceExtentedRefactored() {
        random = new Random();
    }

    public void play() {
        rollDice();
        while (gameEndConditionNotReached()) {
            determineGameStatus();
            totalGames++;
            rollDice();
        }
    }

    private void rollDice() {
        diceSum = random.nextInt(1, 7) + random.nextInt(1, 7);
    }

    private boolean gameEndConditionNotReached() {
        return diceSum != 12;
    }

    private boolean gameIsWon() {
        return diceSum == 7 || diceSum == 11;
    }

    private boolean gameIsLost() {
        return diceSum == 2 || diceSum == 3 || diceSum == 6;
    }

    private void determineGameStatus() {
        if (gameIsWon()) {
            sumOfWins++;
        } else if (gameIsLost()) {
            sumOfLoses++;
        }
    }

    private int getSumOfWins() {
        return sumOfWins;
    }

    private int getSumOfLoses() {
        return sumOfLoses;
    }

    private int getTotalGames() {
        return totalGames;
    }

    public static void main(String[] args) {
        DiceExtentedRefactored dice = new DiceExtentedRefactored();
        dice.play();

        System.out.println("Spēles kopā: " + dice.getTotalGames());
        System.out.println("Vinnētas spēles: " + dice.getSumOfWins());
        System.out.println("Zaudētas spēles: " + dice.getSumOfLoses());
    }

}
