package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CardUser {

    public static void main(String[] args) {

        BankCard myCard = new BankCard("Swedbank", "Maestro", "Andra Paegle",
                "1234 5678 9123 4567", LocalDate.of(2025, 12, 27),
                "123");

        System.out.println("Mana karte:");
        System.out.println(myCard);

        myCard.addFunds(500);
        System.out.println("bilance pēc naudas ieskaitīšanas: " + myCard.getBalance());

        myCard.withdraw(210.50);
        System.out.println("bilance pēc naudas izņemšanas: " + myCard.getBalance());

    }



}

