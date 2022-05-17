package lv.lu.training.lesson5;
import java.time.LocalDate;
public class CardUser {
    public static void main(String[] args) {

        BankCard myCard = new BankCard(
                "Swedbank",
                "Visa",
                "Roberts Polis",
                "2345678345",
                LocalDate.of(2024, 12, 10),
                "134");

        myCard.addFunds(100d);
        myCard.withdraw(20d);

        System.out.println("Mana karte: " + myCard);


    }

}
