package lv.lu.training.lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class oddNumberLookupTest {

    private oddNumberLookup oddNumberLookup;

    @BeforeEach
    public void setUp() {
        oddNumberLookup = new oddNumberLookup();
    }

    @Test
    public void theProvidedNumberIsOdd() {
        Assertions.assertTrue(oddNumberLookup.isOdd(36469));
    }

    @Test
    public void theProvidedNumberIsNotOdd() {
        Assertions.assertFalse(oddNumberLookup.isOdd(240));
    }
}