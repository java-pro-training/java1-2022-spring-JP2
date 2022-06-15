package lv.lu.training.lesson11.lesson;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;


    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }


    @Test
    public void shouldSumTwoNumbers(){
        int result = calculator.sum(10,5);
        Assertions.assertEquals(15,result);
    }

    @Test
    public void shouldSubtractTwoNumbers(){
        int result = calculator.subract(10,5);

        Assertions.assertEquals(5, result);

    }

    @Test
    public void shouldDivideTwoNumbers(){
        int result = calculator.divide(10,2);

        Assertions.assertEquals(5,result);
    }


    @Test
    public void shouldThrowArithmeticException(){

        org.junit.jupiter.api.function.Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                calculator.divide(10,0);
            }
        };
        Assertions.assertThrows(ArithmeticException.class, executable );

    }


    @Test
    public void shouldSumNumberArra(){
        int result = calculator.sum(new int[]{1,2,3,4,5});

        Assertions.assertEquals(15, result);
    }

    @Test
    @Timeout(value=10, unit= TimeUnit.MILLISECONDS)

    public void shouldSumNumberArrayUnderTenMillisecond(){
        int [] numbers = new int[10];
        for(int i=0;i<10;i++){
            numbers[i]= 1;
        }

        int result = calculator.sum(numbers);

        Assertions.assertEquals(10, result);

    }

    @Test

    public void shouldVerifyOddNumber(){
        Assertions.assertTrue(calculator.isOddNumber(1));
    }

    public void shouldVerifyNumberIsNotOdd(){
        Assertions.assertFalse(calculator.isOddNumber(1));
    }

    @Test
    public void shouldMultiplyNumbers(){
        int result = calculator.multiply(10,5);

        Assertions.assertEquals(50, result);
    }

}