package lv.lu.training.lesson12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RefactoredPriceCalculatorTest {

    @Test
    public void shouldApply2PercentDiscountWhenPriceIsLessThan1000() {
        double result = RefactoredPriceCalculator.calculatePrice(100, 5);
        Assertions.assertEquals(490, result);
    }

    @Test
    public void shouldApply2PercentDiscountWhenPriceIs1000() {
        double result = RefactoredPriceCalculator.calculatePrice(100, 10);
        Assertions.assertEquals(980, result);
    }

    @Test
    public void shouldApply5PercentDiscountWhenPriceIsMoreThan1000() {
        double result = RefactoredPriceCalculator.calculatePrice(200, 10);
        Assertions.assertEquals(1900, result);
    }


}