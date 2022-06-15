package lv.lu.training.lesson5;

import java.time.LocalDate;

    public class BankCard {

        private String bankName;
        private String origin;
        private String holderName;
        private String number;
        private LocalDate expiryDate;
        private String cvv;
        private double balance;

        public BankCard(String bankName, String origin, String holderName, String number,
                        LocalDate expiryDate, String cvv){
            this.bankName = bankName;
            this.origin = origin;
            this.holderName = holderName;
            this.number = number;
            this.expiryDate = expiryDate;
            this.cvv = cvv;
            this.balance = 0;
        }

        public void withdraw(double value) {
            this.balance -= value;
            System.out.println("Nauda izņemta");
        }

        public void addFunds(double value) {
            this.balance += value;
            System.out.println("Nauda ieskaitīta");
        }
        public double getBalance(){
            return balance;
        }


    @Override
    public String toString () {
            return "bankCard{" +
                    "Bankas nosaukums='" + bankName + "' " +
                    ",Kartes veids='" + origin + "' " +
                    ", Kartes turētājs='" + holderName + "' " +
                    ", Kartes numurs='" + number + "' " +
                    ", Derīga līdz=" + expiryDate +
                    ", cvv='" + cvv + "' " +
                    ", Konta bilance=" + balance +
                    '}';
        }


}




