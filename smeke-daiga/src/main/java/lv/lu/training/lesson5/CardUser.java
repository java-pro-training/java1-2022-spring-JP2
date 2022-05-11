package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CardUser {
    //Klasei CardUser pievienojam metodi “main”
    public static void main(String[] args) {

    /*metodē “main” izveidojam BankCard objektu
    Konstruktors:
        public BankCard(String bankName,
                    String origin,
                    String holderName,
                    String number,
                    LocalDate expiryDate,
                    String cvv)
     */
        BankCard myCard = new BankCard(
                "Banka Citadele",
                "Visa",
                "Roberts Polis",
                "2345678345",
                LocalDate.of(2024, 12, 10),
                "134");

        //metodē “main” izdrukājam BankCard objektu
        System.out.println("Mana karte: " + myCard); //Mana karte: lv.lu.training.lesson5.BankCard@4c873330 pirms toString

        //Pievienot kartei naudu
        myCard.addFunds(100d);
        System.out.println("The current balance is: " + myCard);

        //Nonemt no kartes naudu
        myCard.withdraw(20d);
        System.out.println("The current balance is: " + myCard);

        }


}
