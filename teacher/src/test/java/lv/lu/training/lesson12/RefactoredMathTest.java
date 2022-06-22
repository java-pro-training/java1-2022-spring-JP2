package lv.lu.training.lesson12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RefactoredMathTest {

    @Test
    public void shouldReturnTrueWhenAIsGreaterThanB() {
        boolean result = RefactoredMath.max(15, 10);
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenAEqualsB() {
        boolean result = RefactoredMath.max(15, 15);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenAIsLessThanB() {
        boolean result = RefactoredMath.max(10, 15);
        Assertions.assertFalse(result);
    }


}