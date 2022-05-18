package lv.lu.training.lesson5;

public class NumbersInMemory {

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = firstNumber;
        int thirdNumber = 10;

        secondNumber++;

        System.out.println("Pirmais skaitlis : " + firstNumber);
        System.out.println("Otrais skaitlis : " + secondNumber);
        System.out.println("Trešais skaitlis : " + thirdNumber);
    }

}
