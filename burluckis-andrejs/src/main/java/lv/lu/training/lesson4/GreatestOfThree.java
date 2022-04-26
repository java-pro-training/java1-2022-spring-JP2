package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        System.out.println("Lūdzu ievadiet jebkuru veselu skaitli no 0 līdz 100 un nospiediet ENTER");
        int firstNumber = scanner.nextInt();
        System.out.println("Ievadiet vēl kādu skaitli no iepriekš minētā diapazona un spiediet ENTER");
        int secondNumber = scanner.nextInt();
        System.out.println("Un vēlreiz ievadiet kādu skaitli no 0 līdz 100 un nospiediet ENTER");
        int thirdNumber = scanner.nextInt();


        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Paldies! No ievadītajiem skaitļiem lielākais ir " + firstNumber);

        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Paldies! No ievadītajiem skaitļiem lielākais ir " + secondNumber);

        }else if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Paldies! No ievadītajiem skaitļiem lielākais ir " + thirdNumber);

    }
}

}
