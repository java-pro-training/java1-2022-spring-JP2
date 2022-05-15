package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args){
        Random random = new Random();
        int sumOfWins = 0;
        int sumOfLosses = 0;
int result = 0;

while (result != 12){

    int dice1;
    int dice2;
    dice1 = random.nextInt(1,7);
    dice2 = random.nextInt(1,7);
    result = dice1 + dice2;
    System.out.println("dice1 - " + dice1);
    System.out.println("dice2 - " + dice2);

    if (result == 7 || result == 11){
        sumOfWins++;
        System.out.println("Result is: " + result);
        System.out.println("You won");
        System.out.println("Total games won: " + sumOfWins + " " + "Total games lost: " + sumOfLosses);
    }else if (result ==2 || result ==3 || result == 6){
        sumOfLosses++;
        System.out.println("Result is: " + result);
        System.out.println("You lose");
        System.out.println("Total games won: " + sumOfWins + " " + "Total games lost: " + sumOfLosses);
    }else if (result == 12){
        System.out.println("Result is: " + result);
        System.out.println("Game finished");
        System.out.println("Total games won: " + sumOfWins + " " + "Total games lost: " + sumOfLosses);
    }else{
        System.out.println("Result is: " + result);
        System.out.println("Try again");
        System.out.println("Total games won: " + sumOfWins + " " + "Total games lost: " + sumOfLosses);
    }
}
    }
}