package lv.lu.training.lesson12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefactoredRectangleTest {

    @Test
    void shouldCalculateArea() {
        RefactoredRectangle rectangle = new RefactoredRectangle();
        rectangle.setValue("width", 10);
        rectangle.setValue("height", 5);

        Assertions.assertEquals(50, rectangle.area());
    }

    @Test
    void shouldCalculateAreaUsingSetters() {
        RefactoredRectangle rectangle = new RefactoredRectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        Assertions.assertEquals(50, rectangle.area());
    }

}