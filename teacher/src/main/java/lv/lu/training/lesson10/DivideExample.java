package lv.lu.training.lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideExample {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            System.out.println("Ievadiet dalāmo: ");
            double a = console.nextDouble();

            System.out.println("Ievadiet dalītāju: ");
            double b = console.nextDouble();
            double result = a / b;
            System.out.println("Dalījuma rezultāts ir: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Netika ievadīts skaitlis.");
        } finally {
            console.close();
        }

    }


}
