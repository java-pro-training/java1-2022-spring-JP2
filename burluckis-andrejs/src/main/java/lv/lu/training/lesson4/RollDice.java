package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();

        int dice1 = random.nextInt(6)+1;
        int dice2 = random.nextInt(6)+1;
        int result = dice1 + dice2;

        System.out.println("Your lucky try result:" + " " + result);
        if (result == 7 || result == 11) {
            System.out.println("Congrats,You won!");
        } else {
            System.out.println("Sorry, You lose :(");
        }

    }
}