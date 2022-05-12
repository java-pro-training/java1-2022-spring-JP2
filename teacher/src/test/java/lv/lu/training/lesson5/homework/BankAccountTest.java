package lv.lu.training.lesson5.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    private static final String BANK_ACCOUNT = "LV55HABA453423423423";
    private static final String PIN_CODE = "1234";
    private static final String INVALID_PIN_CODE = "4321";

    @Test
    public void cannotTopUpAmountIfPinCodeIsNull() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 50.00);
        bankAccount.topUp(100.00);

        assertEquals(100.00, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void cannotTopUpAmountIfPinCodeIsInvalid() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 50.00);
        bankAccount.enterPinCode(INVALID_PIN_CODE);
        bankAccount.topUp(100.00);

        assertEquals(100.00, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void topsUpBalance() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 50.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.topUp(100.00);

        assertEquals(200.00, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void topsUpBalanceWithUsedCredit() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 0.0, 100.00, 50.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.topUp(100.00);

        assertEquals(50, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void topsUpBalanceWithUsedCredit2() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 0.0, 100.00, 50.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.topUp(25.00);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(25, bankAccount.getUsedCredit());
    }

    @Test
    public void cannotWithdrawAmountIfPinCodeIsNull() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 50.00);
        bankAccount.withdraw(100.00);

        assertEquals(100.00, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void cannotWithdrawAmountIfPinCodeIsInvalid() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 50.00);
        bankAccount.enterPinCode(INVALID_PIN_CODE);
        bankAccount.withdraw(100.00);

        assertEquals(100.00, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmount() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 50.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(100.00);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmountFromBalanceAndCredit() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 50.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(125.00);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(25, bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsFullBalanceAndCredit() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 50.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(150.00);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(50, bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsFromCredit() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 0.0, 50.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(25.00);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(25, bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsFromCreditWhenThereIsUsedCredit() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 0.0, 50.00, 25.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(25.00);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(50, bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmountExceedingCreditLimit() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 0.0, 50.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(100);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmountExceedingBalanceWhenCreditLimitIsZero() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 0.0, 0.0);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(100);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmountExceedingCreditWhenThereIsUsedCredit() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 0.0, 50.00, 25.00);
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(100);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(25, bankAccount.getUsedCredit());
    }

    @Test
    public void example1() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 200.00);
        bankAccount.enterPinCode(PIN_CODE);

        bankAccount.withdraw(150);

        assertEquals(0, bankAccount.getBalance());
        assertEquals(50, bankAccount.getUsedCredit());
    }

    @Test
    public void example2() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 200.00, 180.00);
        bankAccount.enterPinCode(PIN_CODE);

        bankAccount.withdraw(150);

        assertEquals(100, bankAccount.getBalance());
        assertEquals(180, bankAccount.getUsedCredit());
    }

    @Test
    public void example3() {
        BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, PIN_CODE, 100.00, 200.00, 180.00);
        bankAccount.enterPinCode(PIN_CODE);

        bankAccount.topUp(300);

        assertEquals(220, bankAccount.getBalance());
        assertEquals(0, bankAccount.getUsedCredit());
    }




}