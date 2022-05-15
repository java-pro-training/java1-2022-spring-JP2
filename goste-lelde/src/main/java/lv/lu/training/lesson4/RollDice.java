package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {

    public static void main (String [] args){
        Random random = new Random();

        int dice1 = random.nextInt(6)+1;
        int dice2 = random.nextInt(6)+1;
        int result = dice1+dice2;

        if (result == 7 || result == 11){
            System.out.println("Summa ir "+result+".");
            System.out.println("Tu esi uzvarejis!");
        }else{
            System.out.println("Summa ir "+result+".");
            System.out.println("Spele ir zaudeta!");
        }


    }

}
