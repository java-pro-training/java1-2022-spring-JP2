package lv.lu.training.lesson6;

import java.util.Random;

public class RollDice2 {

        public static void main(String[] args) {

            Random random = new Random();

            int dice1;
            int dice2;
            int result =0;

            int sumOfWins = 0;
            int sumOfLoses = 0;
            int sumOfTries = 0;


            while (result != 12) {

                dice1 = random.nextInt(1, 7);

                dice2 = random.nextInt(1, 7);

                result = dice1 + dice2;

                if (result == 7 || result == 11) {

                    sumOfWins++;
                    sumOfTries++;

                    System.out.println("Jūsu izmesto skaitļu summa ir " + result + ". Apsveicam, Jūs esat spēlē uzvarējis!");
                    System.out.println("Jūs esat spēlējis " + sumOfTries + " reizes!");
                    System.out.println("Jūs esat zaudējis " + sumOfLoses + " reizes!");
                    System.out.println("Jūs esat uzvarējis " + sumOfWins + " reizes!");

                } else if (result == 2 || result == 3 || result == 6) {

                    sumOfLoses++;
                    sumOfTries++;

                    System.out.println("Jūsu izmesto skaitļu summma ir " + result + ". Dziemžēl laime Jums šodien nesmaida. Esat zaudējis!");
                    System.out.println("Jūs esat spēlējis " + sumOfTries + " reizes!");
                    System.out.println("Jūs esat zaudējis " + sumOfLoses + " reizes!");
                    System.out.println("Jūs esat uzvarējis " + sumOfWins + " reizes!");

                } else {

                    sumOfTries++;

                    System.out.println("Jūsu izmesto skaitļu summma ir " + result + ". Mēģiniet vēlreiz!" );
                    System.out.println("Jūs esat spēlējis " + sumOfTries + " reizes!");
                    System.out.println("Jūs esat zaudējis " + sumOfLoses + " reizes!");
                    System.out.println("Jūs esat uzvarējis " + sumOfWins + " reizes!");
                }


            }
        }
    }

