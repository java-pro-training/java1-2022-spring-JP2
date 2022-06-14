package lv.lu.training.lesson6;


import java.util.Random;

public class RollDiceContinued {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(1,7);
        int dice2 = random.nextInt(1,7);
        int result = dice1 + dice2;
        int sumOfWins = 0;
        int sumOfLoses = 0;
        int totalGames = 0;

        while (result != 12){
        }
         if (result != 7 || result != 11) {
             sumOfLoses++;
         } else if (result == 7 || result == 11){
        sumOfWins++;
             totalGames = result;
        }
         System.out.println("Uzvarētās spēles" + sumOfWins);
         System.out.println("Zaudētas spēles" + sumOfLoses);
         System.out.println("Spēles kopā" + totalGames);
    }

}
//šis jāizpēta vēl, izskatās, ka cikls nebeidzas labprātīgi, iespējams secībā vaina vai definēšanā