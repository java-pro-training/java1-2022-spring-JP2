package lv.lu.training.lesson5.uzdevums1;

import java.time.LocalDate;

public class BankCard {

    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expiryDate;
    private String cvv;
    private double balance;

    public BankCard(String bankName, String origin, String holderName,
                    String number, LocalDate expiryDate, String cvv){
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = 0;
    }

    public void withdraw(double value){
        this.balance -= value;
        System.out.println("Operācija veiksmīgi izpildīta!");
    }

    public void addFunds(double value){
        this.balance += value;
        System.out.println("Konta papildināšana bija veiksmīga!");
    }

    public double getBalance(){return balance;}

    @Override
    public String toString(){
        return "\nBanka: "+bankName+"\n" +
                "Visa vai MasterCard: "+origin+"\n" +
                "Kartes īpašnieks: "+holderName+"\n" +
                "Kartes numurs: "+number+"\n" +
                "Derīga līdz: "+expiryDate+"\n" +
                "CVV: "+cvv+"\n" +
                "Konta bilance: "+balance;
    }


    }

