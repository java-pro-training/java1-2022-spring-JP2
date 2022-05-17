package lv.lu.training.lesson6;

import java.util.Random;

public class RollDiceAdvanced {
    public static void main (String[] args) {
        Random random = new Random();
        int sumOfWins = 0;
        int sumOfLosses = 0;
        int result =0;

        while (result !=12) {

             int dice1 = random.nextInt(1,7);
             int dice2 = random.nextInt(1,7);
             result = (dice1+dice2);

            System.out.println("Pirmais kauliņš: " +dice1);
            System.out.println("Otrais kauliņš: " +dice2);
            System.out.println("Kopā: " + result);

            if (result ==7 || result==11) {
                sumOfWins++;
                System.out.println("Spēle ir vinnēta!!!!");
                System.out.println("Vinnētas reizes: " +sumOfWins +" Zaudētas reizes: " +sumOfLosses);
                System.out.println("=================================================================");
            } else if (result == 2 || result==3 || result ==6) {
                sumOfLosses++;
                System.out.println("Spēle ir zaudēta :(");
                System.out.println("Vinnētas reizes: " + sumOfWins + " Zaudētas reizes: " + sumOfLosses);
                System.out.println("=================================================================");
            } else if (result ==12){
                System.out.println("Spēles beigas.");
                System.out.println("Vinnētas reizes: " +sumOfWins +" Zaudētas reizes: " +sumOfLosses);
                System.out.println("=================================================================");
            } else {
                System.out.println("Metam atkal!");
                System.out.println("Vinnētas reizes: " +sumOfWins +" Zaudētas reizes: " +sumOfLosses);
                System.out.println("=================================================================");
            }
        }
    }
}




