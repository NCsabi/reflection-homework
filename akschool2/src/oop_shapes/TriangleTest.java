package oop_shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void testCalculatePerimeter() {
        Triangle triangle = new Triangle();
        triangle.setA(5);
        triangle.setB(4);
        triangle.setC(4);
        double result = triangle.calculatePerimeter();
        Assertions.assertEquals(13.0, result, 0.001);
    }

    @Test
    void testCalculateArea() {
        Triangle triangle = new Triangle();
        triangle.setA(5);
        triangle.setB(4);
        triangle.setC(6);
        Assertions.assertEquals(9.921, triangle.calculateArea(), 0.001);
    }
}