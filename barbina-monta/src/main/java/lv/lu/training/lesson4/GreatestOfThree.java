package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet skaitli A");
        int a = scanner.nextInt();

        System.out.println("Ievadiet skaitli B");
        int b = scanner.nextInt();

        System.out.println("Ievadiet skaitli C");
        int c = scanner.nextInt();

        GreatestOfThree maxNumber = new GreatestOfThree();
        int result = maxNumber.max(a, b, c);

        System.out.println("Lielākais skaitlis no trim ir: " + result);
    }

    public int max (int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c){
            return b;
        } else {
            return c;
        }
    }



}
