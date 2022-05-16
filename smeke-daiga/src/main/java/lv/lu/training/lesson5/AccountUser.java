package lv.lu.training.lesson5;
/*
import java.util.Scanner;

public class AccountUser {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("2345678345", 1234, 100d, 200d, 180d);

        System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);

        Scanner pinScanner = new Scanner(System.in);
        Scanner opScanner = new Scanner(System.in);

        int count = 0;

        while (count<3) {
            count++;
            System.out.println("Please, enter your PIN code: ");
            int pinCodeByUser = pinScanner.nextInt();
            if (pinCodeByUser == myAccount.thePinIs()) {
                System.out.println("welcome");
                break;
            }
            else {
                System.out.println("Invalid PIN");
            }
        if (count ==3) {
            System.out.println("Sorry you have entered PIN wrong 3 times. Tough luck but no access")
        }



        int pinCodeByUser = 1234;
        double toWithdraw = 0;
        double toAdd = 300;
        char operation = 't';

        switch (operation) {
            case 'w':
                myAccount.whitDraw(toWithdraw);
                System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);
                break;
            case 't':
                myAccount.topUp(toAdd);
                System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);
                break;
            default:
                System.out.println("Invalid operation: " + operation);
                System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);
                break;
        }

        myAccount.topUp(toAdd);
        System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);



    }


}
*/