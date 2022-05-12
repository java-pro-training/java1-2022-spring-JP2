package lv.lu.training.lesson5;
//Izveidojam klasi bankas kartei ar nosaukumu BankCard

//Import local date biblioteku
import java.time.LocalDate;

public class BankCard {
    //Klases lauki
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expiryDate;
    private String cvv;
    private double balance;

    //Klases konstruktors
    public BankCard(String bankName,
                    String origin,
                    String holderName,
                    String number,
                    LocalDate expiryDate,
                    String cvv) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = 0;
    }

    //Metode naudas iznemsanai
    public void withdraw(double value) {
        this.balance -= value;
    }

    //Metode naudas pievienosanai
    public void addFunds(double value) {
        this.balance += value;
    }

    //Metode “toString”

    @Override
    public String toString() {
        return "BANK CARD" + "\r\n" +
                "Name of the bank = " + bankName + "\r\n" +
                "Origin = " + origin + "\r\n" +
                "Card holder name = " + holderName + "\r\n" +
                "Card number = " + number + "\r\n" +
                "Valid thru = " + expiryDate + "\r\n" +
                "CVV = " + cvv + "\r\n" +
                "Balance = " + balance;
    }

}
