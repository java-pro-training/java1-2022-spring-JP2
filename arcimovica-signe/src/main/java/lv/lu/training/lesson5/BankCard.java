package lv.lu.training.lesson5;

import java.time.LocalDate;

public class BankCard { //kartei izveido privātus datus
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expiryDate;
    private String cvv;
    private double balance;

    public BankCard(String bankName, //izveido konstruktoru
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

   // Izveido metodi naudas izņemšanai
    public void withdraw(double value) {
        this.balance -= value;
    }

    // Izveido metodi naudas ielikšanai kontā
    public void addFunds(double value) {
        this.balance += value;
    }

        @Override //salīdzina konta datus pēc izmaiņām
    public String toString(){
        return "BankCard{" +
                "bankName='" + bankName + "' " +
                ", origin='" + origin + "' " +
                ", holderName='" + holderName + "' " +
                ", number='" + number + "' " +
                ", expiryDate=" + expiryDate +
                ", cvv='" + cvv + "' " +
                ", balance=" + balance +
                '}';
    }
}
