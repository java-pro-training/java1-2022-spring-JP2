package lv.lu.training.lesson4;

import java.util.Random;


public class RollDice {

    public static void main(String[] args) {
        Random random = new Random();
        int firstDice = random.nextInt(6) + 1;
        int secondDice = random.nextInt(6) + 1;

        int diceTotal = firstDice + secondDice;

        if (diceTotal == 7 || diceTotal == 11) {
            System.out.println("Congrats, you've won!");
        } else {
            System.out.println("I'm sorry, you've lost!");
        }
    }

}
