package lv.lu.training.lesson2;

import java.time.LocalDate;
public class CardUser {
    private static System system;

    public static void main(String[] args) {
        BankCard myCard = new BankCard("Luminor", "Visa", "Oksana Kirilova", "2345678345",
                LocalDate.of(2024, 12, 10), "134");
        myCard.addFunds(100d);
        system.out.println("Mana karte: " + myCard);
        myCard.withdraw(20d);
        System.out.println("Mana karte: " + myCard);
    }
}


