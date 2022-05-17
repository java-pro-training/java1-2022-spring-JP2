package lv.lesson6.homework6;
import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Numbers inputNumbers = new Numbers(6, 1);
        Numbers numbers = new Numbers();
        Random random = new Random();
        int result;
        int sumOfWins = 0;
        int sumOfLoose = 0;
        int numberOfTry = 0;

        do {
            int duce1 = random.nextInt(inputNumbers.getMaxNumber() - inputNumbers.getMinNumber() +1)+ inputNumbers.getMinNumber();
            int duce2 = random.nextInt(inputNumbers.getMaxNumber() - inputNumbers.getMinNumber() +1)+ inputNumbers.getMinNumber();
            result = duce1 + duce2;

            if (result == 7 || result == 11){
                sumOfWins ++;
                numbers.printWin(result,sumOfWins,sumOfLoose);//Call a method print win

            }else if(result == 2 || result == 3 || result == 6){
                sumOfLoose ++;
                numbers.printLoose(result,sumOfWins,sumOfLoose);//Call a method print loose
            }
            numberOfTry ++;
        }while (result != 12);
        System.out.println("\nNumbers of try are: " + numberOfTry);
    }
}
