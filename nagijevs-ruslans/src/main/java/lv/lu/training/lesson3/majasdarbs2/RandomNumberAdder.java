package lv.lu.training.lesson3.majasdarbs2;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args){
        Random randomNumberGenerator = new Random();
        int a = randomNumberGenerator.nextInt(999);
        int b = randomNumberGenerator.nextInt(999);
        int c = randomNumberGenerator.nextInt(999);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int result = a + b + c;
        System.out.println(result);
    }
}
