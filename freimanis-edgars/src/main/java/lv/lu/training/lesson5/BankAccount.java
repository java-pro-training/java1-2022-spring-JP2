package lv.lu.training.lesson5;

public class BankAccount {
        private String accountNumber;
        private String pinCode;
        private double balance;
        private double creditLimit;
        private double usedCredit;

        public void enterPinCode(String pinCode){
                this.pinCode = pinCode;
        }
        public void topUp (double amount){
                balance += amount;
        }
        public void withdraw(double amount){
                balance -=amount;
        }
        private boolean isPinCodeValid(){
                return pinCode !=null
                        && pinCode.length()==4;
        }



    }

