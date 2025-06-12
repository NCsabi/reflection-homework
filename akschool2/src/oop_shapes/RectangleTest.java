package oop_shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        double result = rectangle.calculatePerimeter();
        Assertions.assertEquals(18.0, result, 0.001);
    }

    @Test
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        Assertions.assertEquals(20.0, rectangle.calculateArea(), 0.001);
    }
}