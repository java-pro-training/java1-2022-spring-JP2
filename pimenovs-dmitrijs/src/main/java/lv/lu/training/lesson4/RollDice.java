package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args){
        Random random = new Random();

    int dice1;
    int dice2;
        dice1 = random.nextInt(1,7);
        dice2 = random.nextInt(1,7);
       int result = dice1 + dice2;

    System.out.println("dice1 - " + dice1);
    System.out.println("dice2 - " + dice2);
        System.out.println("Rezultats" + " " + result);
    if (result == 7 || result == 11){
        System.out.println("You won");
    }else{
        System.out.println("You lost");
    }
}
    }
