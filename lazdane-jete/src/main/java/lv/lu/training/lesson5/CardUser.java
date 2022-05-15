package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CardUser {
    public static void main (String[] args){

        BankCard myCard = new BankCard(
                "Bank of America",
                "Mastero",
                "John Hill",
                "6198420916",
                LocalDate.of(2025, 11, 27),
                "629");

        myCard.addFunds (100d);
        myCard.withdraw (20d);

        System.out.println ("My card: " + myCard);






    }
}
