package lv.lu.training.lesson3.homeWork2;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
       Random randomNumberGenerator = new Random();

       int randomNumberGenerator1 = randomNumberGenerator.nextInt(101);
       int randomNumberGenerator2 = randomNumberGenerator.nextInt(101);
       int randomNumberGenerator3 = randomNumberGenerator.nextInt(101);

       System.out.println("Random Integer1: " +randomNumberGenerator1);
       System.out.println("Random Integer2: " +randomNumberGenerator2);
       System.out.println("Random Integer3: " +randomNumberGenerator3);

       int Result = randomNumberGenerator1 + randomNumberGenerator2 + randomNumberGenerator3;
       System.out.println("Random Integer sum: " +Result);

    }
}
