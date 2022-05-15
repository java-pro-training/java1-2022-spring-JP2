package lv.lesson6.homework6;
import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Numbers inputNumbers = new Numbers(6, 1);
        Random random = new Random();
        int result;
        int sumOfWins = 0;
        int sumOfLoose = 0;
        int numbersOfTry = 0;

        do {
            int duce1 = random.nextInt(inputNumbers.getMaxNumber() - inputNumbers.getMinNumber() +1)+ inputNumbers.getMinNumber();
            int duce2 = random.nextInt(inputNumbers.getMaxNumber() - inputNumbers.getMinNumber() +1)+ inputNumbers.getMinNumber();
            result = duce1 + duce2;

            if (result == 7 || result == 11){
                sumOfWins ++;
                System.out.println("You are von!, the sum of random number is: " + result);
                System.out.println("Numbers of the wins are: " + sumOfWins);
                System.out.println("Numbers of the wins are: " + sumOfLoose);

            }else if(result == 2 || result == 3 || result == 6){
                sumOfLoose ++;
                System.out.println("You are loose!, the sum of random number is: " + result);
                System.out.println("Numbers of the wins are: " + sumOfWins);
                System.out.println("Numbers of the wins are: " + sumOfLoose);
            }
            numbersOfTry ++;
        }while (result != 12);
        System.out.println("Numbers of try are: " + numbersOfTry);

    }
}
