package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice { //izveido jaunu klasi
    public static void main(String[] args) { //izveido main metodi
        int dice1;
        int dice2;

        Random random = new Random(); // izveido objektu, kas generē nejaušus skaitļus
        dice1 = random.nextInt(1, 6); // pirmais kauliņš
        dice2 = random.nextInt(1, 6); // otrais kauliņš

        int result = dice1 + dice2; // nejauši ģenerēto skaitļu summas aprēķins
        System.out.println("result " +result); // summas izvade

        if (result == 7 || result ==11) { // ar Būla metodi pārbauda - uzvarētājs vai zaudētājs, un izvada atbilstošu paziņojumu
            System.out.println("You have won the game");
        }
        else {
            System.out.println("You have lose the game");
        }

    }
}
