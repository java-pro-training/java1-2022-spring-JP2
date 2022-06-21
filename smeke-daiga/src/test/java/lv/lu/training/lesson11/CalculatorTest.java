package lv.lu.training.lesson11;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    //kalkulatora objektu vajag tikai vienu, nevis katra testa taisit savu
    //koplietojami objekti setUp
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test //anotacija vajadziga, lai programma zinatu, ka sis ir tests
    //Testa metodes parasti neko neatgriez
    public void shouldSumTwoNumbers() {
        //Calculator calculator = new Calculator(); - var nemt ara tagad, kad setUp uztaisits
        int result = calculator.sum(10,5);

        //Assert otrais parametrs musu faktiskais rezultats
        assertEquals(15, result); //import static org.junit.jupiter.api.Assertions.*;
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        int result = calculator.subtract(10,5);
        assertEquals(5, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        int result = calculator.divide(10,2);
        assertEquals(5, result);
    }

    @Test
    public void shouldThrowArithmeticException() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
    }

    @Test
    public void shouldSumArrays () {
        int result = calculator.sumArray(new int[]{1, 2,3,4,5});
        assertEquals(15, result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    public void shouldSumArrayInOneMillisecond() {
        int [] numbers = new int [1000];
        for (int i =0; i <1000; i++) {
            numbers[i] = 1;
        }
        int result = calculator.sumArray(numbers);
        assertEquals(1000, result);
    }

    //parametrizetais tests - PASLAIK AIZMIRSTAM
    //@Test
    //@ParameterizedTest
    //@ValueSource(ints = {1})
    //public void shouldSumTwoNumbers(int a, int b) {
    //    int result = calculator.sum(10,5);
    //    assertEquals(15, result); //import static org.junit.jupiter.api.Assertions.*;
    //}

    @Test
    public void shouldVerifyIfOdd() {
        assertTrue(calculator.isOdd(1));
    }
}