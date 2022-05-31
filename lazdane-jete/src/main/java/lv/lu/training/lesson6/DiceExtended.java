package lv.lu.training.lesson6;

import java.util.Random;

public class DiceExtended {
    public static void main (String[] args) {

        Random random = new Random();

        int sumOfWins = 0;
        int sumOfLoses = 0;
        int result = 0;

        while (result != 12){
        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1,7);
        result = dice1 + dice2;
        System.out.println ("Divu uzmesto kauliņu summa ir: " + result);


            if ((result == 2) || (result == 3) || (result == 6)) {
                sumOfLoses++;

                System.out.println ("                                    ");
                System.out.println("Spēle ir zaudēta!");
                System.out.println("Uzvarēto spēļu skaits:" + sumOfWins);
                System.out.println("Zaudēto spēļu skaits:" + sumOfLoses);
                System.out.println ("                                    ");


            } else if ((result == 7) || (result == 11)) {
                sumOfWins++;

                System.out.println ("                                    ");
                System.out.println("Spēle ir uzvarēta!");
                System.out.println("Uzvarēto spēļu skaits:" + sumOfWins);
                System.out.println("Zaudēto spēļu skaits:" + sumOfLoses);
                System.out.println ("                                    ");

            } else
                System.out.println ("                                    ");
                System.out.println ("Atkal metam kauliņus!");
                System.out.println("Uzvarēto spēļu skaits:" + sumOfWins);
            System.out.println("Zaudēto spēļu skaits:" + sumOfLoses);
            System.out.println ("                                    ");
        }
    }
}
