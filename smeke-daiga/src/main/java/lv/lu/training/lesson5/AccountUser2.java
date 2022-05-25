package lv.lu.training.lesson5;

import java.util.Scanner;


import java.util.Scanner;

public class AccountUser2 {

    public static void main(String[] args) {
        BankAccount2 myAccount = new BankAccount2("12124263463", "0001", 168.45d, 300d, 0d);

        String validPin = myAccount.pinCode();

        int i = 0;
        Scanner pinScanner = new Scanner(System.in);
        Scanner operationScanner = new Scanner(System.in);
        Scanner amountScanner = new Scanner(System.in);
        char operation;
        boolean pinCodeValid = false;
        String pinEnteredByUser;
        double toWithdraw;
        double toAdd;

        while (!pinCodeValid) {
            System.out.println("Please enter your pin code");
            pinEnteredByUser = pinScanner.next();
            pinCodeValid = validPin.equals(pinEnteredByUser); //Sets pinCodeValid to true
            i++;
            if (!pinCodeValid && i<3)
                System.out.println("PIN you entered is Invalid. Remaining tries " + (3-i));
            else if (pinCodeValid)
                System.out.println("The PIN is valid");
            else {
                System.out.println("The account is blocked");
                break;
            }
        if (pinCodeValid) {
            System.out.println("Please enter operation to perform. t - to top up; w - to withdraw; b - to display balance");
            operation = operationScanner.next().charAt(0);
            switch (operation) {
                case 't':
                    System.out.println("Please amount you want to deposit:");
                    toAdd = amountScanner.nextDouble();
                    myAccount.topUp(toAdd);
                    System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);
                    break;
                case 'w':
                    System.out.println("Please amount you want to withdraw:");
                    toWithdraw = amountScanner.nextDouble();
                    myAccount.whitDraw(toWithdraw);
                    System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);
                    break;
                case 'b':
                    System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);
                    break;
                default:
                    System.out.println("Invalid operation: " + operation);
                    System.out.println("Mana konta stāvoklis: " + "\r\n" + myAccount);
                    break;
            }
        }
        }
    }
}
