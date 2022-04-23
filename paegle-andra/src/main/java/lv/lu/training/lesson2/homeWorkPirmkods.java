package lv.lu.training.lesson2;

import java.util.Random;
import java.util.random.RandomGenerator;

public class homeWorkPirmkods {
    public static void main(String[] args) {
        Random RandomGenerator = new Random();
        int randomNumber = RandomGenerator.nextInt(101);
        System.out.println(randomNumber);
    }
}
