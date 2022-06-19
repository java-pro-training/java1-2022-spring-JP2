package lv.lu.training.lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTest {

    private OddNumberLookup oddNumberLookup;

    @BeforeEach
    public void set() {
        oddNumberLookup = new OddNumberLookup(1, 7);
    }

    @Test
    public void isOdd() {
        boolean result = oddNumberLookup.isOdd(9);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void firstNumber() {
        int result = oddNumberLookup.getFrom();
        Assertions.assertEquals(1, result);
    }

    @Test
    public void lastNumber() {
        int result = oddNumberLookup.getTill();
        Assertions.assertEquals(9, result);
    }

}

