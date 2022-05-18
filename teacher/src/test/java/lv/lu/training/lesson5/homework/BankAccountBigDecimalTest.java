package lv.lu.training.lesson5.homework;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountBigDecimalTest {

    private static final String BANK_ACCOUNT = "LV55HABA453423423423";
    private static final String PIN_CODE = "1234";
    private static final String INVALID_PIN_CODE = "4321";

    @Test
    public void cannotTopUpAmountIfPinCodeIsNull() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.topUp(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(100.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void cannotTopUpAmountIfPinCodeIsInvalid() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(INVALID_PIN_CODE);
        bankAccount.topUp(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(100.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void topsUpBalance() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.topUp(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(200.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void topsUpBalanceWithUsedCredit() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(0.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.topUp(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(50.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void topsUpBalanceWithUsedCredit2() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(0.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.topUp(BigDecimal.valueOf(25.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(25.00), bankAccount.getUsedCredit());
    }

    @Test
    public void cannotWithdrawAmountIfPinCodeIsNull() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.withdraw(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(100.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void cannotWithdrawAmountIfPinCodeIsInvalid() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(INVALID_PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(100.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmount() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmountFromBalanceAndCredit() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(125.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(25.00), bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsFullBalanceAndCredit() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(150.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(50.00), bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsFromCredit() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(0.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(25.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(25.00), bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsFromCreditWhenThereIsUsedCredit() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(0.00), BigDecimal.valueOf(50.00), BigDecimal.valueOf(25.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(25.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(50.00), bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmountExceedingCreditLimit() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(0.00), BigDecimal.valueOf(50.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmountExceedingBalanceWhenCreditLimitIsZero() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(0.00), BigDecimal.valueOf(0.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void withdrawsAmountExceedingCreditWhenThereIsUsedCredit() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(0.00), BigDecimal.valueOf(50.00), BigDecimal.valueOf(25.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(100.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(25.00), bankAccount.getUsedCredit());
    }

    @Test
    public void example1() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(200.00));
        bankAccount.enterPinCode(PIN_CODE);

        bankAccount.withdraw(BigDecimal.valueOf(150.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(50.00), bankAccount.getUsedCredit());
    }

    @Test
    public void example2() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(200.00), BigDecimal.valueOf(180.00));
        bankAccount.enterPinCode(PIN_CODE);

        bankAccount.withdraw(BigDecimal.valueOf(150.00));

        assertEquals(BigDecimal.valueOf(100.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(180.00), bankAccount.getUsedCredit());
    }

    @Test
    public void example3() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(100.00), BigDecimal.valueOf(200.00), BigDecimal.valueOf(180.00));
        bankAccount.enterPinCode(PIN_CODE);

        bankAccount.topUp(BigDecimal.valueOf(300.00));

        assertEquals(BigDecimal.valueOf(220.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getUsedCredit());
    }

    @Test
    public void testRounding() {
        BankAccountBigDecimal bankAccount = new BankAccountBigDecimal(BANK_ACCOUNT, PIN_CODE, BigDecimal.valueOf(168.45), BigDecimal.valueOf(300.00));
        bankAccount.enterPinCode(PIN_CODE);
        bankAccount.withdraw(BigDecimal.valueOf(200.00));

        assertEquals(BigDecimal.valueOf(0.00), bankAccount.getBalance());
        assertEquals(BigDecimal.valueOf(31.55), bankAccount.getUsedCredit());
    }


}