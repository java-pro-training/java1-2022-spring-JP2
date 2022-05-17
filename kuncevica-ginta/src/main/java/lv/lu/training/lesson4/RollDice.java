package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {
     public static void main(String[] args) {

         Random random = new Random();

         int dice1 = random.nextInt(1,7);
         int dice2 = random.nextInt(1,7);

         System.out.println("dice1 = " + dice1);
         System.out.println("dice2 = " + dice2);

         int result = (dice1 + dice2);
         System.out.println("sum = " + result);

         if(result==7 || result==11){
             System.out.println("Spēle ir vinnēta");
         }else {
             System.out.println("Spēle ir zaudēta");}
     }
}
