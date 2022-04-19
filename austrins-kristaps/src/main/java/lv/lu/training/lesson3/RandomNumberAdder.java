package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args ) {

        Random randomNumberGenerator = new Random();

        int pirmaisSkaitlis = randomNumberGenerator.nextInt();
        int otraisSkatlis = randomNumberGenerator.nextInt();
        int tresaisSkaitlis = randomNumberGenerator.nextInt();

        int result = pirmaisSkaitlis + otraisSkatlis + tresaisSkaitlis;

        System.out.println("Rezultāts = " + result);
    }
}
