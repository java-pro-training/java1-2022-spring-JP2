package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int a = randomNumberGenerator.nextInt(5);
        int b = randomNumberGenerator.nextInt(777);
        int c = randomNumberGenerator.nextInt(999);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int result = a + b + c;
        System.out.println(result);
    }
}
