package lv.lu.training.lesson4;

import java.util.Random;

public class EvenOrOdd {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " Is an even number");
        else
            System.out.println(number + " Is an odd number");
    }
}
