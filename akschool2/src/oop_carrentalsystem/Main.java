package oop_carrentalsystem;

public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();

        Car car1 = new Car("ABC000", 125.25, Brand.BMW, "X5");
        Car car2 = new Car("ZZZ111", 450.20, Brand.MERCEDES, "gle");
        Car car3 = new Car("OT1625", 25.00, Brand.TRABANT, "601");

        system.addCar(car1);
        system.addCar(car2);
        system.addCar(car2);

        system.displayAvailableCars();

        Car rent = system.findCarByPlateNumber("ZZZ111");
        if (rent != null) {
            system.rentCar(rent, 5);
        } else {
            System.out.println("Car not found.");
        }
    }
}
