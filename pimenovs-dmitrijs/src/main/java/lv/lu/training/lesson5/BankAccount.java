package lv.lu.training.lesson5;

public class BankAccount {

        private String accountNumber;
        private String pinCode;
        private double balance;
        private double creditLimit;
        private double usedCredit;
        private boolean isPinCodeValid;


        public BankAccount(String accountNumber, String pinCode, double balance, double creditLimit, double usedCredit) {
            this.accountNumber = accountNumber;
            this.pinCode = pinCode;
            this.balance = balance;
            this.creditLimit = creditLimit;
            this.usedCredit = usedCredit;
        }

        public void enterPinCode(String pinCode) {
            isPinCodeValid = this.pinCode.equals(pinCode);
        }

        public void topUp(double amount) {
            if (isPinCodeValid) {
                if (usedCredit > 0) {
                    usedCredit -= amount;
                    if (usedCredit < 0) {
                        balance -= usedCredit;
                        usedCredit = 0;
                    }
                } else {
                    balance += amount;
                }
            }

        }

        public void withdraw(double amount) {
            if (isPinCodeValid) {
                if (balance - amount >= 0) {
                    balance -= amount;
                } else if (balance + creditLimit - usedCredit - amount >= 0) {
                    balance -= amount;
                    usedCredit -= balance;
                    balance = 0;
                } else {
                    System.out.println("Insufficient Funds");
                }
            }
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", pinCode='" + pinCode + '\'' +
                    ", balance=" + balance +
                    ", creditLimit=" + creditLimit +
                    ", usedCredit=" + usedCredit +
                    ", isPinCodeValid=" + isPinCodeValid +
                    '}';
        }
    }



