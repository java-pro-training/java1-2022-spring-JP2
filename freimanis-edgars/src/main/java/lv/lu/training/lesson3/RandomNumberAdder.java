package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main (String[] args){

        Random randomNumberGenerator = new Random();

       int result = randomNumberGenerator.nextInt() + randomNumberGenerator.nextInt() + randomNumberGenerator.nextInt() ;

        System.out.println("Trīs random skaitļu summa " + result);

    }


}
