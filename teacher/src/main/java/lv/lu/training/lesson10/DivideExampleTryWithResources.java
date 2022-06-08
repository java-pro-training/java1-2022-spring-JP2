package lv.lu.training.lesson10;

import java.util.Scanner;

public class DivideExampleTryWithResources {

    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Ievadiet dalāmo: ");
            double a = console.nextDouble();

            if (a < 0) {
                throw new ArithmeticException("Dalāmajam jābūt lielākam par 0");
            }

            System.out.println("Ievadiet dalītāju: ");
            double b = console.nextDouble();
            double result = a / b;
            System.out.println("Dalījuma rezultāts ir: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ir jāvieda skaitlis!");
        }
    }

}
