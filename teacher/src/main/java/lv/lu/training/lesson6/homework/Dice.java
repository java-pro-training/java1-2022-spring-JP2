package lv.lu.training.lesson6.homework;

import java.util.Random;

public class Dice {

    private int diceTotal;
    private int gamesPlayed;
    private int gamesWon;
    private final Random random;

    public Dice() {
        random = new Random();
    }

    public void play() {
        roleDices();
        while (diceTotal != 12) {
            if (diceTotal == 7 || diceTotal == 11) {
                gamesWon++;
            }
            gamesPlayed++;
            roleDices();
        }
    }

    public int gamesPlayed() {
        return gamesPlayed;
    }

    private void roleDices() {
        diceTotal = rollDice() + rollDice();
    }

    public int gamesWon() {
        return gamesWon;
    }


    private int rollDice() {
        return random.nextInt(6) + 1;
    }


    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.play();

        System.out.println(dice.gamesWon() + " out of " + dice.gamesPlayed() + " games won!");
    }


}
