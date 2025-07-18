package oop_carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Car> availableCars = new ArrayList<>();

    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void displayAvailableCars() {
        for (Car car : availableCars) {
            car.displayInfo();
        }
    }

    public Car findCarByPlateNumber(String plateNumber) {
        for (Car car : availableCars) {
            if (car.getPlateNUmber().equalsIgnoreCase(plateNumber)) {
                return car;
            }
        }
        return null;
    }

    public void rentCar(Car car, int days) {
        System.out.println("Renting car: ");
        car.displayInfo();
        System.out.println("Total cost for: " + days + " days: " + car.calculateRentalCost(days) + " €");
    }
}
