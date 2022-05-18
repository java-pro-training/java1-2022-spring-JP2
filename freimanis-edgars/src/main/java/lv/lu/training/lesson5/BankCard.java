package lv.lu.training.lesson5;

import java.time.LocalDate;

public class BankCard {
@Override
public String toString(){
    return "BankCard " +
            "bankName= '" + bankName + "' " +
            ", origin='" + origin + "' " +
            ", holderName= '" + holderName + "' " +
            ", cardNumber='" + cardNumber + "' " +
            ", expiryDate='" + expiryDate + "' " +
            ", cvv='" + cvv + "' "+
            ", balance='" +balance +"'";


}
      private String bankName;
      private String origin;
      private String holderName;
      private String cardNumber;
      private LocalDate expiryDate;
      private String cvv;
      private double balance;

      public BankCard (String bankName,String origin, String holderName, String cardNumber, LocalDate expiryDate, String cvv){
          this.bankName = bankName;
          this.origin = origin;
          this.holderName = holderName;
          this.cardNumber = cardNumber;
          this.expiryDate = expiryDate;
          this.cvv = cvv;
          this.balance = 0;
      }
      public void withdraw (double value) {
          this.balance -= value;
      }
      public void addFunds (double value){
          this.balance += value;
      }










}
