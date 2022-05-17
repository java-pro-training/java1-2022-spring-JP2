package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {
    public static void main (String[] args){
        Random random = new Random();
        int maxValue = 6;
        int dice1 = random.nextInt(maxValue);
        int dice2 = random.nextInt(maxValue);
        int result = ((dice1+1)+(dice2+1));
        System.out.println(result);
        if (result ==7 || result==11) {
            System.out.println("Spēle ir vinnēta");
        }else {
            System.out.println("Spēle ir zaudēta");
        }



    }
}
