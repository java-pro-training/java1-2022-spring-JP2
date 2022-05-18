package lv.lu.training.lesson6;

import java.util.Scanner;

public class BiggestOfThree2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestNumber=0;
int b = 3;
while (b>0){
    System.out.println("ENTER NUMBER: ");
    int number = scanner.nextInt();
    if (number>biggestNumber){
        biggestNumber=number;
    }
    b--;
}
System.out.println("Biggest number is: " +biggestNumber);
    }
}
