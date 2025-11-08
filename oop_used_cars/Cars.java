package oop_used_cars;

public class Cars {
    private String id;
    private String brand;
    private String type;
    private int engineCapacity;
    private int passengerCount;
    private int year;
    private int price;
    private int mileage;
    private String fuelType;

    public Cars(String id, String brand, String type, int engineCapacity, int passengerCount, int year, int price, int mileage, String fuelType) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.engineCapacity = engineCapacity;
        this.passengerCount = passengerCount;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return String.format(
                "Cars: id='%s', brand='%s', type='%s', engineCapacity=%d, passengerCount=%d, year=%d, price=%d, mileage=%d, fuelType='%s'",
                id, brand, type, engineCapacity, passengerCount, year, price, mileage, fuelType
        );
    }
}
