package lv.lu.training.lesson2;
import java.util.Random;

public class RollDice {
    public static void main(String [] Args) {
        Random random = new Random();
        int dice1 = random.nextInt(1,6);
        int dice2 = random.nextInt(1,6);

        int result = dice1 + dice2;
        System.out.println(dice1 + "+" +dice2+ "=" + result);
        if (result==7 || result==11){
            System.out.println("Spēle ir vinnēta.");}
            else {
                System.out.println("Spēle ir zaudēta.");
            }
        }
    }

