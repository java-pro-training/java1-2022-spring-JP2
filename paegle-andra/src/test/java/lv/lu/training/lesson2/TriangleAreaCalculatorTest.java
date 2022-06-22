package lv.lu.training.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaCalculatorTest {
    @Test
    public void shouldCalculateArea() {
        int base = 10;
        int height = 20;
        int result = (base*height)/2;
        assertEquals(100, result);
    }

}