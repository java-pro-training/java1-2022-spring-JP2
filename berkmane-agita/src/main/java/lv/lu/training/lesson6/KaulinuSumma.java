package lv.lu.training.lesson6;
import java.util.Random;

public class KaulinuSumma {
    public static void main(String[] args) {

        int kaulinuSumma = 0;
        int vinnetoSpeluSumma = 0;
        int zaudetoSpeluSumma = 0;
        int kopejoSpeluSumma = 0;

        while(kaulinuSumma!=12) {
            Random random= new Random();
            int dice1 = random.nextInt(1,7);
            int dice2 = random.nextInt(1,7);

             kaulinuSumma = dice1 + dice2;


            if (kaulinuSumma == 7 || kaulinuSumma == 11) {
               // System.out.println("Spēle ir vinnēta.");
                vinnetoSpeluSumma = vinnetoSpeluSumma+1;
            }

        else if (kaulinuSumma==2 || kaulinuSumma==3 || kaulinuSumma == 6){
             //   System.out.println("Spēle ir zaudēta.");
                zaudetoSpeluSumma = zaudetoSpeluSumma+1;
            }
        kopejoSpeluSumma = kopejoSpeluSumma+1;

        }
        System.out.println("Vinnētas  " + vinnetoSpeluSumma + " spēles");
        System.out.println("Zaudētas  " + zaudetoSpeluSumma + " spēles");
        System.out.println("Kopā nospēlētas  " + kopejoSpeluSumma + " spēles");
    }
}
