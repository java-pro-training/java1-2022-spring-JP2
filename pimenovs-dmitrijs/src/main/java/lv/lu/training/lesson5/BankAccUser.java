package lv.lu.training.lesson5;

import java.util.Scanner;

public class BankAccUser {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            BankAccount bankAccount = new BankAccount("LV67PARX1133144", "2415", 100, 200, 0);

            bankAccount.enterPinCode(scanner.next());
            bankAccount.withdraw(150);
            System.out.println("bank acc status" + bankAccount);

            bankAccount.enterPinCode(scanner.next());
            bankAccount.topUp(20);
            System.out.println("bank acc status: " + bankAccount);

            bankAccount.enterPinCode(scanner.next());
            bankAccount.withdraw(205);
            System.out.println("bank acc status" + bankAccount);

        }
    }


