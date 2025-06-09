package oop_shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void testCalculatePerimeter() {
        Circle circle = new Circle();
        circle.setRadius(5);
        double result = circle.calculatePerimeter();
        Assertions.assertEquals(31.41592653589793, result);
    }

    @Test
    void testCalculateArea() {
        Circle circle = new Circle();
        circle.setRadius(5);
        Assertions.assertEquals(78.53981633974483, circle.calculateArea());
    }
}
