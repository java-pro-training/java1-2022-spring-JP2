package lv.lu.training.lesson5;

import java.util.Scanner;

public class BankAccUser {

        public static void main(String[] args) {
Scanner amountScanner = new Scanner(System.in);
Scanner opScanner = new Scanner(System.in);
            Scanner pinScanner = new Scanner(System.in);
            BankAccount bankAccount = new BankAccount("LV67PARX1133144", "2415", 100, 200, 0);
            char operation;
            int tries = 0;

            while (tries < 3){
                tries++;
                System.out.println("Enter Pin Code: ");
                String enteredPin = pinScanner.next();
              if (enteredPin.equals(bankAccount.getPinCode())){
                  System.out.println("Welcome");
                  bankAccount.enterPinCode(bankAccount.getPinCode());
                  tries=0;

                  System.out.println("Choose operation: t - topUp; w - withdraw; b - balance; e - exit");
                  operation = opScanner.next().charAt(0);
                  switch (operation){
                      case 't':
                          System.out.println("TopUp amount: ");
                          bankAccount.topUp(amountScanner.nextInt());
                          System.out.println("Account balance: " +bankAccount);
                          continue;
                      case 'w':
                          System.out.println("Withdraw amount: ");
                          bankAccount.withdraw(amountScanner.nextInt());
                          System.out.println("Account balance: " + bankAccount);
                          continue;
                      case 'b':
                          System.out.println("Account balance: " + bankAccount);
                          continue;
                      case 'e':
                          System.out.println("Thanks for using our service!!");
                          break;
                      default:
                          System.out.println("Incorrect operation");
                          continue;
                  }
                  break;
                }else{
                  System.out.println("Incorrect Pin");
                }
                if (tries==3){
                    System.out.println("Account Blocked");
                }
            }
        }
    }


