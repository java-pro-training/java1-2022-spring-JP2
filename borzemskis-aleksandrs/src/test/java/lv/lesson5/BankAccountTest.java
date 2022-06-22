package lv.lesson5;


import org.assertj.core.api.SoftAssertions;
import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;

public class BankAccountTest {
    private static final String BANK_ACCOUNT = "LV55HABA456978231456";
    private static final String VALID_PIN = "8745";
    private static final String INVALID_PIN = "6597";

    private BankAccount bankAccount;

    @Before
    public void setUp() {
        bankAccount = new BankAccount(BANK_ACCOUNT, VALID_PIN, 328, 200);
    }

    @Test
    public void addMoneyToAccount() {
        bankAccount.topUp(200, VALID_PIN);

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(528);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(0);
        softly.assertAll();
    }

    @Test
    public void withDrawWithInvalidPinCode() {
        bankAccount.withDraw(450, INVALID_PIN);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(328);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(0);
        softly.assertAll();
    }

    @Test
    public void withdrawBiggerThenAccount() {
        bankAccount.withDraw(450, VALID_PIN);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(0);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(122);
        softly.assertAll();
    }

    @Test
    public void withdrawLessThenAccount() {
        bankAccount.withDraw(120, VALID_PIN);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(208);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(0);
        softly.assertAll();
    }

    @Test
    public void withdrawLessThenAccountNotThisBanknotes() {
        bankAccount.withDraw(128, VALID_PIN);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(328);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(0);
        softly.assertAll();
    }

    @Test(timeout = 10)
    public void withdrawLessThenAccountNotThisBanknotesTimeout() {
        bankAccount.withDraw(128, VALID_PIN);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(bankAccount.getUserBalance()).isEqualTo(328);
        softly.assertThat(bankAccount.getUsedCredit()).isEqualTo(0);
        softly.assertAll();
    }

    @Test
    public void sortOfBanknotes() {
        Assert.assertFalse(bankAccount.isNoSmallBanknotes(10));
    }

    @Test
    public void isBalanceCleared() {
        bankAccount.clearBalance();
        assertThat(bankAccount.getUserBalance()).isEqualTo(0);
    }

    @After
    public void tearDown() {
        bankAccount = null;
    }

}
