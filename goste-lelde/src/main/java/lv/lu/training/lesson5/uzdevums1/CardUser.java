package lv.lu.training.lesson5.uzdevums1;

import java.time.LocalDate;

public class CardUser {

    public static void main(String[] args){

        BankCard myCard = new BankCard("SEB banka","Visa", "Lelde Goste",
                "1234 1234 1234 1234", LocalDate.of(2022,8,22),"123");

        System.out.println("Mana karte:");
        System.out.println(myCard);

        myCard.addFunds(100);
        System.out.println("Jaunā bilance: "+ myCard.getBalance());

        myCard.withdraw(20);
        System.out.println("Jaunā bilance:"+myCard.getBalance());

    }



}
