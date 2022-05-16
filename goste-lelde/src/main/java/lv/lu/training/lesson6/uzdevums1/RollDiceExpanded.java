package lv.lu.training.lesson6.uzdevums1;

import java.util.Random;

public class RollDiceExpanded {

    public static void main (String [] args){
        Random random = new Random();

        int result = 0;
        int sumOfWins = 0;
        int sumOfLosses = 0;
        int numberOfTrys=0;

        while (result != 12) {

            int dice1 = random.nextInt(6)+1;
            int dice2 = random.nextInt(6)+1;
            result = dice1+dice2;

            if (result == 7 || result == 11) {
                sumOfWins++;
                numberOfTrys++;
                System.out.println("Summa ir " + result + ".");
                System.out.println("Esi uzvarejis!");
                System.out.println("Uzvaras: " + sumOfWins + "; Zaudejumi: " + sumOfLosses + ".");
                System.out.println("-------------------------------------------------");

            } else if (result == 2 || result == 3 || result == 6) {
                sumOfLosses++;
                numberOfTrys++;
                System.out.println("Summa ir " + result + ".");
                System.out.println("Spele ir zaudeta!");
                System.out.println("Uzvaras: " + sumOfWins + "; Zaudejumi: " + sumOfLosses + ".");
                System.out.println("-------------------------------------------------");

            } else if (result == 12){
                numberOfTrys++;
                System.out.println("Summa ir " + result + ".");
                System.out.println("Speles beigas!");
                System.out.println("-------------------------------------------------");

            } else {
                numberOfTrys++;
                System.out.println("Summa ir " + result + ".");
                System.out.println("Megini velreiz!");
                System.out.println("-------------------------------------------------");

            }


        }
        System.out.println("Tu izspeleji " + (numberOfTrys) + " speles! Uzvaras: " + sumOfWins + ";Zaudejumi: " + sumOfLosses + ".");




    }

}
