package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {

        Random random = new Random();

        int dice1 = random.nextInt(1,7);

        int dice2 = random.nextInt(1,7);

        int result = dice1 + dice2;

        if (result == 7 || result == 11)
        {
            System.out.println("Jūsu izmesto skaitļu summa ir " + result + ". Apsveicam, Jūs esat spēlē uzvarējis!");
        }
        else {
            System.out.println("Jūsu izmesto skaitļu summma ir " + result + ". Dziemžēl laime Jums šodien nesmaida. Esat zaudējis!");
        }

    }
}
