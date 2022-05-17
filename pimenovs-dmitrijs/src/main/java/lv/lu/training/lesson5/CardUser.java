package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Citadele Banka","Visa","Dmitrijs Pimenovs","2345678345",LocalDate.of(2024,5,8),"288");

        System.out.println("Mana karte: " + myCard);

        myCard.addFunds(100d);
        System.out.println("Mana karte: " + myCard);

        myCard.wirthdraw(20d);
        System.out.println("Mana karte: " + myCard);
    }

    }

