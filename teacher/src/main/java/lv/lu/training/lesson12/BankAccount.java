package lv.lu.training.lesson12;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public int withdraw(double amount) {
        if (amount > balance)
            return -1;
        else {
            balance -= amount;
            return 0;
        }
    }

}
