package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CardUser {
    public static void main (String[] args){
        BankCard myCard = new BankCard("SEB", "VISA", "Edgars Freimanis",
                "5891019274241240032", LocalDate.of(2023,9,15), "176");

        myCard.addFunds(100d);

        myCard.withdraw(20);
        System.out.println("Mana karte: " +myCard);

    }
}
