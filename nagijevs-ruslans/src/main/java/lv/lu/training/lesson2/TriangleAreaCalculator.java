package lv.lu.training.lesson2;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args){
        int base = 10;
        int height = 20;
        int result = (base*height)/2;
        System.out.println("Trijstūra laukums: " + result);

        //Vēl viens kods - bišiņ interesantāks

        Scanner scan = new Scanner(System.in);
        System.out.print("Ievadiet trijstūra pamatu: ");
        double pamats = scan.nextInt();
        System.out.print("Ievadiet trijstūra augstumu: ");
        int augstums = scan.nextInt();
        double laukums = (pamats * augstums)/2;
        System.out.println("Trijstūra laukums ir " + laukums);

    }
}
