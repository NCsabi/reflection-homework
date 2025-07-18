package oop_carrentalsystem;

public abstract class Vehicle {
    private String plateNUmber;
    private double rentPrice;

    public Vehicle(String plateNUmber, double rentPrice) {
        this.plateNUmber = plateNUmber;
        this.rentPrice = rentPrice;
    }

    public String getPlateNUmber() {
        return plateNUmber;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public abstract void displayInfo();

    public abstract double calculateRentalCost(int days);
}
