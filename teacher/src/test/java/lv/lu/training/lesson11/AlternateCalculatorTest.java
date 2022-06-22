package lv.lu.training.lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class AlternateCalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldSumTwoNumbers() {
        List<NumberContainer> numbers = new ArrayList<>();
        numbers.add(new NumberContainer(10, 5, 15));
        numbers.add(new NumberContainer(0, 5, 5));
        numbers.add(new NumberContainer(10, 0, 10));
        numbers.add(new NumberContainer(-10, 0, -10));
        numbers.add(new NumberContainer(0, -5, -5));
        numbers.add(new NumberContainer(-10, -5, -15));
        numbers.add(new NumberContainer(0, 0, 0));

        for(NumberContainer number : numbers) {
            int result = calculator.sum(number.getA(), number.getB());
            Assertions.assertEquals(number.getExpectedResult(), result);
        }
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
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                calculator.divide(10, 0);
            }
        };

        Assertions.assertThrows(ArithmeticException.class, executable);
    }

    @Test
    public void shouldSumNumberArray() {
        int result = calculator.sum(new int[]{1, 2, 3, 4, 5});

        Assertions.assertEquals(15, result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    public void shouldSumNumberArrayUnderTenMilliseconds() {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = 1;
        }

        int result = calculator.sum(numbers);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldVerifyOddNumber() {
        Assertions.assertTrue(calculator.isOdd(1));
    }

    @Test
    public void shouldVerifyNumberIsNotOddNumber() {
        Assertions.assertFalse(calculator.isOdd(2));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = calculator.multiply(10, 5);
        Assertions.assertEquals(50, result);
    }

}