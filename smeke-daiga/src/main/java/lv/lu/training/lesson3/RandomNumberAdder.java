package lv.lu.training.lesson3;

import java.util.Random;

//Izveidot klasi
public class RandomNumberAdder {
    //Pievienot main metodi
    public static void main(String[] args) {
        //viens klases Random objekts
        Random randomNumberGenerator = new Random();
    //Klasi Random nepieciešams importēt
    //Do I really need to...? Let's try without? If I do need to import - does it go before or after I make the object?
    //import java.util.Random;

    //What is "lokāls mainīgajais"? In eng...
    //Let's make it a reasonable random number
        int firstNumber = randomNumberGenerator.nextInt(100);
        int secondNumber = randomNumberGenerator.nextInt(100);
        int thirdNumber = randomNumberGenerator.nextInt(100);

    //Just want to see what numbers it is about to sum up
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        System.out.println("Sum of three random numbers: " + (firstNumber + secondNumber + thirdNumber));
    }
}
