package lv.lu.training.lesson5;
import java.time.LocalDate;

public class BankCard {

private String bankName;
private String origin;
private String holderName;
private String number;
private LocalDate expireDate;
private String cvv;
private double balance;

public BankCard(String bankName, String origin, String holderName, String number, LocalDate expireDate, String cvv) {
    this.bankName = bankName;
    this.origin = origin;
    this.holderName = holderName;
    this.number = number;
    this.expireDate = expireDate;
    this.cvv = cvv;
    this.balance = 0;
}

public void withdraw(double value) {
    this.balance -= value;
}

public void addFunds(double value) {
    this.balance += value;
    }
    public String toString() {
    return "BankCard {" +
            "bankName='" + bankName + "' " +
            ", origin='" + origin + "' " +
            ", holderName='" + holderName + "' " +
            ", number='" + number + "' " +
            ", expireDate=" + expireDate +
            ", cvv='" + cvv + "' " +
            ", balance=" + balance +
            '}';
    }
}
