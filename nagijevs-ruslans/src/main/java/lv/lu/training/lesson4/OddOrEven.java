package lv.lu.training.lesson4;

import java.util.Random;

public class OddOrEven {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();

        System.out.println("Random number is " + number + ".");
        if (number % 2 == 0) {
            System.out.println("Random number is even number.");
        } else {
            System.out.println("Random number is odd number.");
        }

    }
}
