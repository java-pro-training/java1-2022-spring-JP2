package lv.lu.training.lesson5.uzdevums2;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args){



        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber("11HABA123456789");
        myAccount.setPinCode("9876");
        myAccount.setDebitBalance(100);
        myAccount.setUsedCredit(180);

        String enteredPin;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Sveicināti!");
        System.out.println("Lai piekļūtu "+myAccount.getAccountNumber()+" ievadiet PIN:");


       for (int i=3;i>0;i--) {
            enteredPin = scanner.nextLine();
            myAccount.checkPinCode(enteredPin);
            if (myAccount.isPinCorrect) {
                break;
            }
            if (i == 1) {
                System.out.println("Nepareizs PIN ir ievadīts 3 reizes.");
                System.out.println("Karte ir bloķēta.");
                myAccount=null;
            } else {
                System.out.println("Nepareiz PIN. Mēģiniet vēlreiz:");
            }
        }

        System.out.println("Debeta bilance: "+myAccount.getDebitBalance());
        System.out.println("Izmantotais kredīts: "+myAccount.getUsedCredit());
        System.out.println("Konta sākuma bilance ir: "+myAccount.getAccountBalance());


        System.out.println("Lai veiktu naudas izmaksu ievadiet PIN kodu:");
        enteredPin = scanner.nextLine();


        myAccount.checkPinCode(enteredPin);
        myAccount.withdraw(150, enteredPin);


        System.out.println("Konta balans pēc operācijas: "+ myAccount.getAccountBalance());
        System.out.println("Debeta bilance: "+myAccount.getDebitBalance());
        System.out.println("Izmantotais kredīts: " + myAccount.getUsedCredit());

        System.out.println("Lai veiktu naudas iemaksu ievadiet PIN kodu:");
        enteredPin = scanner.nextLine();

        myAccount.checkPinCode(enteredPin);
        myAccount.topUp(80, enteredPin);

        System.out.println("Konta galīgais balans: "+ myAccount.getAccountBalance());
        System.out.println("Debeta bilance: "+myAccount.getDebitBalance());
        System.out.println("Izmantotais kredīts: " + myAccount.getUsedCredit());

    }
}
