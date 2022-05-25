package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {

        BankCard myCard = new BankCard("Swedbank", "Master", "Andra Paegle",
                "7845123", LocalDate.of(2025,11,27), "007");
    }
}
