package oop_carrentalsystem;

public class Car extends Vehicle {

    private Brand brand;
    private String model;

    public Car(String plateNUmber, double rentPrice, Brand brand, String model) {
        super(plateNUmber, rentPrice);
        this.brand = brand;
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand + "\n" + "Model: " + model + "\n" + "Plate number: "
                + getPlateNUmber() + "\n" + "Rent Price per Day: " + getRentPrice() + " €\n");

    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentPrice() * days;
    }
}
