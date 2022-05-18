package lv.lu.training.lesson6.uzdevums2;

import java.util.Scanner;

public class BiggestOfThree {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = 0;

        for (int i=3;i>0;i--){
            System.out.println("Ievadiet veselu skaitli:");
            int number = scanner.nextInt();
            if (number>biggest){
                biggest=number;
            }
        }

        System.out.println("Lielakais skaitlis ir:" + biggest );
    }
}
