package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args){
        Random random = new Random();
        int maxNumber = 6;
        int minNumber = 1;

        int dice1 = random.nextInt(minNumber,maxNumber);
        int dice2 = random.nextInt(minNumber,maxNumber);
        System.out.println("dice1 - " + dice1);
        System.out.println("dice2 - " + dice2);

        int result = dice1 + dice2;
        System.out.println("Rezultats" + " " + result);

        if(result==7 || result==11){
            System.out.println("Spele ir vinnēta");

        }else{
            System.out.println("Spele ir zaudēta");
        }

    }
}