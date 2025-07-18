package oop_carrentalsystem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CarRentalSystemTests {
    @Test
    public void testCalculateRentalCost() {
        Car car = new Car("AAA111", 100.0, Brand.BMW, "X3");
        double price = car.calculateRentalCost(5);
        assertEquals(500.0, price, 0.001);
    }

    @Test
    public void testFindCarNotFound() {
        RentalSystem system = new RentalSystem();
        Car result = system.findCarByPlateNumber("BBBBBB");
        assertNull(result);
    }
}
