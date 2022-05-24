package lv.lu.training.lesson6;

import java.util.Random;

public class RollDice {
    public static void main(String[]args){
        Random random = new Random();
        int result = 0;
        int sumOfWins = 0;
        int sumOfLoses = 0;

        while (result != 12){
            int dice1 = random.nextInt(1,7);
            int dice2 = random.nextInt(1,7);
            result = dice1+dice2;

            if (result == 7 || result == 11){
                sumOfWins++;
                System.out.println("Rezultāts ir:" +result);
                System.out.println("Spēle ir vinnēta!");
                System.out.println("Uzvaras:" + sumOfWins + "Zaudētas spēles:" + sumOfLoses);

            } else if (result == 2 || result == 3 || result == 6){
                sumOfLoses++;
                System.out.println("Rezultāts ir:" + result);
                System.out.println("Spēle ir zaudēta!");
                System.out.println("Uzvaras:" + sumOfWins + "Zaudētas spēles:" + sumOfLoses);

            }else if(result !=12){
                System.out.println("Rezultāts ir:" + result);
                System.out.println("Spēle ir beigusies!");
                System.out.println("Uzvaras:" + sumOfWins + "Zaudētas spēles:" + sumOfLoses);
            }else{
                System.out.println("Rezultāts ir:" + result);
                System.out.println("Mēģini vēlreiz!");
                System.out.println("Uzvaras:" + sumOfWins + "Zaudētas spēles:" + sumOfLoses);
            }

        }

    }
}
