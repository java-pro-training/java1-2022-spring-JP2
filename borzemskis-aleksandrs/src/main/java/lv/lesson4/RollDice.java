package lv.lesson4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Numbers inputNumbers = new Numbers(6, 1);
        Random random = new Random();
        int duce1 = random.nextInt(inputNumbers.getMaxNumber() - inputNumbers.getMinNumber() +1)+ inputNumbers.getMinNumber();
        int duce2 = random.nextInt(inputNumbers.getMaxNumber() - inputNumbers.getMinNumber() +1)+ inputNumbers.getMinNumber();
        int result = duce1 + duce2;

        if (result == 7 || result ==11){
            System.out.println("You are von!, the sum of random number is: " + result);
        }else{
            System.out.println("You are loose!, the sum of random number is: " + result);
        }
    }
}
