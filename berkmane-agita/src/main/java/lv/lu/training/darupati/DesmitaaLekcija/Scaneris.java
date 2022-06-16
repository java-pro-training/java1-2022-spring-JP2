package lv.lu.training.darupati.DesmitaaLekcija;

import java.util.Scanner;
public class Scaneris {
    public static void main (String[] args){
        System.out.println("Ievadi kaut ko!");
        Scanner scanner =  new Scanner(System.in);
        String ievade = scanner.next();
        System.out.println(ievade);
        scanner.close();
    }
}
