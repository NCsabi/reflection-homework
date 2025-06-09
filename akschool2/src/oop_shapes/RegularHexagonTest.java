package oop_shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegularHexagonTest {
    @Test
    void testCalculatePerimeter() {
        RegularHexagon hexagon = new RegularHexagon();
        hexagon.setSide(5);
        double result = hexagon.calculatePerimeter();
        Assertions.assertEquals(30.0, result);
    }

    @Test
    void testCalculateArea() {
        RegularHexagon hexagon = new RegularHexagon();
        hexagon.setSide(5);
        Assertions.assertEquals(64.9519052838329, hexagon.calculateArea());
    }
}