package lv.lu.training.lesson6;

import java.util.Random;

public class rollDice {

    public static void  main(String[] args) {

        Random random = new Random();

            int dice1;
            int dice2;
            int result = 0;
            int sumOfLoses = 0;
            int sumOfWins = 0;
            int sumOfRolls = 0;

        while (result != 12) {

            dice1 = random.nextInt(1, 7);
            dice2 = random.nextInt(1, 7);

            result = dice1 + dice2;


            System.out.println("Uzmesto kauliņu summa ir " + result + "!");

        if (result == 2 || result == 3 || result == 6) {

                sumOfLoses++;
                sumOfRolls++;

            System.out.println("Jūsu uzmestais skaitlis ir " + result + "." + " Jūs zaudējāt!");
            System.out.println("Jūs esat spēlē zaudējis " + sumOfLoses + " reizes !");
            System.out.println("Jūs esat piedalijies spēlē " + sumOfRolls + " reizes !");
            System.out.println("Jūs esat spēlē vinējis " +sumOfWins + " reizes !");

    }   else if ( result == 7 || result == 11){

                sumOfWins++;
                sumOfRolls++;

            System.out.println("Jūsu uzmestais skaitlis ir " +result + "." + " Jūs vinējāt!");
            System.out.println("Jūs esat spēlē uzvarējis "+ sumOfWins + " reizes !");
            System.out.println("Jūs esat piedalijies spēlē " + sumOfRolls + " reizes !");
            System.out.println("Jūs esat spēlē zaudējis " + sumOfLoses + " reizes !");

    }   else {

                sumOfRolls++;

            System.out.println("Jūsu uzmestais skaitlis ir " + result + "." + "Mēģiniet velreiz !");
            System.out.println("Jūs esat spēlē uzvarējis "+ sumOfWins + " reizes !");
            System.out.println("Jūs esat piedalijies spēlē " + sumOfRolls + " reizes !");
            System.out.println("Jūs esat spēlē zaudējis " + sumOfLoses + " reizes !");


        }


    }







    }




}
