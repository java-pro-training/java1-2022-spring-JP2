package lv.lu.training.lesson5;

public class BankAccount {

    private String accountNumber;
    private String pinCode;
    private double debitBalance;
    private double creditLimit;
    private double creditUsed;
    private boolean isPinCodeValid;

    public BankAccount(String accountNumber, String pinCode, double debitBalance, double creditLimit) {
        this(accountNumber, pinCode, debitBalance, creditLimit, 0.0);
    }
    public BankAccount(String accountNumber, String pinCode, double debitBalance, double creditLimit, double creditUsed) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.creditUsed = creditUsed;
    }

    public void enterPinCode(String pinCode) { isPinCodeValid = this.pinCode.equals(pinCode); }

    public void topUp(double amount) {
        if (isPinCodeValid) {
            if (creditUsed > 0) {
                creditUsed -= amount;
                if (creditUsed < 0) {
                    debitBalance -= creditUsed;
                    creditUsed = 0;
                }
            } else {
                debitBalance += amount;
            }
        }

    }

    public void withdraw(double amount) {
        if (isPinCodeValid) {
            if (debitBalance - amount >= 0) {
                 debitBalance -= amount;
            } else if (debitBalance + creditLimit - creditUsed - amount >= 0) {
                debitBalance -= amount;
                creditUsed -= debitBalance;
                debitBalance = 0;
            }
        }
    }
    public double getDebitBalance() { return debitBalance; }

    public double getCreditUsed() { return creditUsed; }

}
