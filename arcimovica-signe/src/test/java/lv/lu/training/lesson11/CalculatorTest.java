package lv.lu.training.lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldSumTwoNumbers() {
        int result = calculator.sum(10, 5);

        Assertions.assertEquals(15, result);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        int result = calculator.subtract(10, 5);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        int result = calculator.divide(10, 2);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldThrowArithmeticException() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));

    }
}