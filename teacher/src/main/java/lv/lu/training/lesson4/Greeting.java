package lv.lu.training.lesson4;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.next();

        System.out.println("Hello " + name + "!");
    }

}
