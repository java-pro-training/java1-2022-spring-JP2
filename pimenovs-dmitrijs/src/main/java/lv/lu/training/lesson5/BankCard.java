package lv.lu.training.lesson5;


import java.time.LocalDate;

public class BankCard {
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expiryDate;
    private String CVV;
    private double balance;

    public BankCard(String bankName,String origin,String holderName,String number,LocalDate expiryDate,String CVV){
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
        this.balance = 0;

    }
    public void wirthdraw(double value){
        this.balance -= value;
    }
    public void addFunds(double value){
        this.balance += value;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "bankName='" + bankName + '\'' +
                ", origin='" + origin + '\'' +
                ", holderName='" + holderName + '\'' +
                ", number='" + number + '\'' +
                ", expiryDate=" + expiryDate +
                ", CVV='" + CVV + '\'' +
                ", balance=" + balance +
                '}';
    }
}
