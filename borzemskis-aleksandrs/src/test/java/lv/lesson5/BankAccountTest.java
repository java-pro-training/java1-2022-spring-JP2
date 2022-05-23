package lv.lesson5;


import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankAccountTest {
    private static final String BANK_ACCOUNT = "LV55HABA456978231456";
    private static final String VALID_PIN = "8745";
    private static final String INVALID_PIN = "6597";

    BankAccount bankAccount = new BankAccount(BANK_ACCOUNT, VALID_PIN, 328.45, 200);

    @Before
    public void setUp() {

    }

    @Test
    public void addMoneyToAccount() {
        bankAccount.topUp(200, VALID_PIN);

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(528.45);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(0);

        bankAccount.withDraw(450,INVALID_PIN);


        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(528.45);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(0);

        bankAccount.withDraw(450,VALID_PIN);

        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(78.45);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(0);
        softly.assertAll();
    }

    @Test
    public void sortOfBanknotes(){
        Assert.assertTrue(bankAccount.isNoSmallBanknotes(10));
    }


}
