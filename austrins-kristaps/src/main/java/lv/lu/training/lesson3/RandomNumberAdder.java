package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args ) {

        Random randomNumberGenerator = new Random();

        int pirmaisSkaitlis = randomNumberGenerator.nextInt();
        int otraisSkaitlis = randomNumberGenerator.nextInt();
        int tresaisSkaitlis = randomNumberGenerator.nextInt();

        int result = pirmaisSkaitlis + otraisSkaitlis + tresaisSkaitlis;

        System.out.println("Rezultāts = " + result);
    }
}
