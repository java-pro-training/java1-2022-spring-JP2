package lv.lu.training.lesson5;
/*
//Izveidojam klasi bankas kontam ar nosaukumu BankAccount


public class BankAccount {
    private String accountNumber;
    private int pinCode;
    private double debitBalance;
    private double creditLimit;
    private double usedCredit;

    //Klases konstruktors
    public BankAccount(String accountNumber, int pinCode, double debitBalance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

    //Metode naudas iznemsanai
    public void whitDraw(double value) {
        if (value <= debitBalance)
            debitBalance -= value;
        else if (value <= debitBalance + creditLimit - usedCredit){
            usedCredit += (value - debitBalance);
            debitBalance = 0;
        }
        else
            System.out.println("The transaction cannot be performed. Credit limit will be exceeded.");

    }

    //Metode naudas pievienosanai
    public void topUp(double value) {
        if (usedCredit > 0 && value <= usedCredit) {
            usedCredit -= value;
        }
        else if (usedCredit > 0 && value > usedCredit) {
            debitBalance = debitBalance + value - usedCredit;
            usedCredit = 0;
        }
        else
            debitBalance += value;
        }


    //Get pin to compare with user's input
    public int thePinIs() {
        return pinCode;
    }


    @Override
    public String toString() {
        return  "Debeta bilance  = " + debitBalance + "\r\n" +
                "Kredīta limits = " + creditLimit + "\r\n" +
                "Izmantotais kredīts = " + usedCredit;
    }
}
*/