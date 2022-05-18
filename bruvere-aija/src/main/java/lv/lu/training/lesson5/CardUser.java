package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CardUser {
    public void main (String[] args){
        BankCard myCard = new BankCard(
                "Banka Citadele",
                "Visa",
                "Aija Bruvere",
                "2345678345",
                LocalDate.of(2024,12,20),
                "234");
        myCard.addFunds(100d);
        myCard.withdraw(20d);

        System.out.println("Mana karte:" + myCard);
    }
}
