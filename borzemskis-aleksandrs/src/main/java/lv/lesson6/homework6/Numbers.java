package lv.lesson6.homework6;

import lombok.Data;

@Data
public class Numbers {
    private int maxNumber;
    private int minNumber;
    private int firstInputNumber;
    private int secondInputNumber;
    private int thirdInputNumber;

    Numbers(){}

    Numbers(int maxNumber, int minNumber){
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }
    void printWin(int result, int sumOfWins, int sumOfLoose){
        System.out.println("You are von!, the sum of random number is: " + result);
        System.out.println("Numbers of the wins are: " + sumOfWins);
        System.out.println("Numbers of the wins are: " + sumOfLoose);
    }
    void printLoose(int result, int sumOfWins, int sumOfLoose){
        System.out.println("You are loose!, the sum of random number is: " + result);
        System.out.println("Numbers of the wins are: " + sumOfWins);
        System.out.println("Numbers of the wins are: " + sumOfLoose);
    }

}
