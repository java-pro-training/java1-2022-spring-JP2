package lv.lu.training.lesson5.uzdevums2;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args){

        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber("11HABA123456789");
        myAccount.setPinCode("9876");
        myAccount.setDebitBalance(100);

        Scanner scanner = new Scanner(System.in);


        System.out.println(myAccount.getAccountBalance());
        System.out.println(myAccount.getDebitBalance());
        System.out.println(myAccount.getUsedCredit());


        System.out.println("Lai veiktu darbības ievadiet PIN kodu:");
        String enteredPin = scanner.nextLine();

 /*       for (int i=3;i>0;i--){
            myAccount.checkPinCode(enteredPin);
            if(myAccount.isPinCorrect) {
                break;
            }
            if (i==1){
                System.out.println("Nepareizs PIN ir ievadīts 3 reizes.");
                System.out.println("Karte ir bloķēta.");
            } else{
                System.out.println("Nepareiz PIN. Mēģiniet vēlreiz:");
                 }
        } */

       myAccount.checkPinCode(enteredPin);
       myAccount.withdraw(170, enteredPin);

       System.out.println("Konta balans: "+ myAccount.getAccountBalance());
       System.out.println("Debeta bilance: "+myAccount.getDebitBalance());
       System.out.println("Used credit: " + myAccount.getUsedCredit());





    }
}
