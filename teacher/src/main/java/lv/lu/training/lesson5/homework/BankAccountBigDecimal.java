package lv.lu.training.lesson5.homework;

import java.math.BigDecimal;

public class BankAccountBigDecimal {

    private String accountNumber;
    private String pinCode;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal usedCredit;
    private boolean isPinCodeValid;

    public BankAccountBigDecimal(String accountNumber, String pinCode, BigDecimal balance, BigDecimal creditLimit) {
        this(accountNumber, pinCode, balance, creditLimit, BigDecimal.valueOf(0.00));
    }

    public BankAccountBigDecimal(String accountNumber, String pinCode, BigDecimal balance, BigDecimal creditLimit, BigDecimal usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

    public void enterPinCode(String pinCode) {
        isPinCodeValid = this.pinCode.equals(pinCode);
    }

    public void topUp(BigDecimal amount) {
        if (isPinCodeValid) {
            if (usedCredit.compareTo(BigDecimal.ZERO) == 1) {
                usedCredit = usedCredit.subtract(amount);
                if (usedCredit.compareTo(BigDecimal.ZERO) == -1) {
                    balance = balance.subtract(usedCredit);
                    usedCredit = BigDecimal.valueOf(0.00);
                }
            } else {
                balance = balance.add(amount);
            }
        }

    }

    public void withdraw(BigDecimal amount) {
        if (isPinCodeValid) {
            if (balance.subtract(amount).compareTo(BigDecimal.ZERO) > -1) {
                balance = balance.subtract(amount);
            } else if (balance.add(creditLimit).subtract(usedCredit).subtract(amount).compareTo(BigDecimal.ZERO) > -1) {
                balance = balance.subtract(amount);
                usedCredit = usedCredit.subtract(balance);
                balance = BigDecimal.valueOf(0.00);
            }
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getUsedCredit() {
        return usedCredit;
    }

}



