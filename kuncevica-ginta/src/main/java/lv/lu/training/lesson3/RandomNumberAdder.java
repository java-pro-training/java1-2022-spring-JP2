package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {
  public static void main(String[] args) {

    Random randomNumberGenerator = new Random();

    int result1 = randomNumberGenerator.nextInt();
    int result2 = randomNumberGenerator.nextInt();
    int result3 = randomNumberGenerator.nextInt();

    System.out.println(" Pirmais patvaļīgais skaitlis: " + result1);
    System.out.println(" Otrais patvaļīgais skaitlis: " + result2);
    System.out.println(" Trešais patvaļīgais skaitlis: " + result3);
    System.out.println("Trīs patvaļīgu skaitļu summa: " + (result1 + result2 + result3));
  }
}