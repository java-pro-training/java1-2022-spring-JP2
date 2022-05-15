package lv.lu.training.lesson5;

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
        if (value <= this.debitBalance)
            this.debitBalance -= value;
        else if (value <= this.debitBalance + this.creditLimit - this.usedCredit){
            this.usedCredit += (value - this.debitBalance);
            this.debitBalance = 0;
        }
        else
            System.out.println("The transaction cannot be performed. Credit limit will be exceeded.");

    }

    //Metode naudas pievienosanai
    public void topUp(double value) {
        if (this.usedCredit > 0 && value <= this.usedCredit) {
            this.usedCredit -= value;
        }
        else if (this.usedCredit > 0 && value > this.usedCredit) {
            this.debitBalance = this.debitBalance + value - this.usedCredit;
            this.usedCredit = 0;
        }
        else
            this.debitBalance += value;
        }


    //Get pin to compare with user's input
    public int thePinIs() {
        return this.pinCode;
    }


    @Override
    public String toString() {
        return  "Debeta bilance  = " + debitBalance + "\r\n" +
                "Kredīta limits = " + creditLimit + "\r\n" +
                "Izmantotais kredīts = " + usedCredit;
    }
}
