package lv.lu.training.darupati.DesmitaaLekcija;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void  setUp(){
        calculator = new Calculator();
    }

    @Test
    public void shoudSumTwoNumbers(){
       // Calculator calculator = new Calculator();
        int result = calculator.sum(10,5);
        Assertions.assertEquals(15, result);
    }
    @Test
    public void shoudSubtractTwoNumbers(){
      //  Calculator calculator = new Calculator();
        int result = calculator.subtract(10,5);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void shoudDivideTwoNumbers(){
        //  Calculator calculator = new Calculator();
        int result = calculator.divide(10,5);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void shoudDivideWithZeroTrowsExceprion(){
        //  Calculator calculator = new Calculator();
    //    Executable executable = new Executable(){
      //      @Override
        //    public void execute () throws  Trowable{
          //      calculator.divide(10,0)
            //}
       // };
       Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));

    }

@Test
    public void shoudVerifyIsOdd(){
        Assertions.assertTrue(calculator.isOdd(1));
}

    @Test
    public void shoudVerifyIsNotOdd(){
        Assertions.assertFalse(calculator.isOdd(2));
    }
}