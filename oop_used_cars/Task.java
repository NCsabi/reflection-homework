package oop_used_cars;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//miért nem kell példányosítani a Cars osztályt?-
//static a metódusok elött meg ugy általában
//try-with-resources
//github feltöltés akschool2/oop_employeeworkhouranalytics

public class Task {
    int countCars(List<Cars> cars) {
        return cars.size();
    }

   static double calculateAveragePriceOfPetrolCars(List<Cars> cars) {
        int count = 0;
        int price = 0;
        for (Cars car : cars) {
            if (car.getFuelType().equals("benzin")) {
                count++;
                price += car.getPrice();
            }
        }
        return count > 0 ? (double) price / count : 0.0;
    }

    double getAverageMileageOfDieselCars(List<Cars> cars) {
        int count = 0;
        int mileage = 0;
        for (Cars car : cars) {
            if (car.getFuelType().equalsIgnoreCase("dízel")) {
                count++;
                mileage += car.getMileage();
            }
        }
        return count > 0 ? (double) mileage / count : 0.0;
    }

    boolean searchHybridCar(List<Cars> cars) {
        for (Cars car : cars) {
            if (car.getFuelType().equalsIgnoreCase("hibrid")) {
                return true;
            }
        }
        return false;
    }

    void printCarsWithInvalidId(List<Cars> cars) {
        for (Cars car : cars) {
            String idYear = car.getId().substring(9);
            if (idYear.equals(String.valueOf(car.getYear()))) {
                System.out.println(car);
            }
        }
    }

    void addNewCar(List<Cars> cars) {
       try( Scanner scanner = new Scanner(System.in)) {
           System.out.println("Please enter the ID: ");
           String carId = scanner.nextLine();
           System.out.println("Brand: ");
           String brand = scanner.nextLine();
           System.out.println("Model: ");
           String model = scanner.nextLine();
           System.out.println("EngineCapacity: ");
           int engineCapacity = Integer.parseInt(scanner.nextLine());
           System.out.println("SeatingCapacity: ");
           int seatingCapacity = Integer.parseInt(scanner.nextLine());
           System.out.println("YearOfManufacture: ");
           int yearOfManufacture = Integer.parseInt(scanner.nextLine());
           System.out.println("Price: ");
           int price = Integer.parseInt(scanner.nextLine());
           System.out.println("Mile age: ");
           int mileAge = Integer.parseInt(scanner.nextLine());
           System.out.println("Fuel type: ");
           String fuelType = scanner.nextLine();
       }
           Cars newCar = new Cars(carId, brand, model, engineCapacity, seatingCapacity, yearOfManufacture, price, mileAge, fuelType);


        int insertIndex = -1;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId().equals("DFW11771-2017")) {
                insertIndex = i + 1;
                break;
            }
        }
        if (insertIndex != -1) {
            cars.add(insertIndex, newCar); //a megadott indexre teszi az új elemet.
            System.out.println("The new car successfully added");
        } else {
            cars.add(newCar);
            System.out.println("The car added to the end of the list");
        }
    }

    void printNewestCar(List<Cars> cars) {
        Cars newestCar = cars.get(0);
        for (Cars car : cars) {
            if (car.getYear() > newestCar.getYear()) {
                newestCar = car;
            }
        }
        System.out.println("The newest car is:");
        System.out.println(newestCar);
    }


    void printOldestCar(List<Cars> cars) {
        int oldestYear = cars.get(0).getYear();
        for (Cars car : cars) {
            if (oldestYear > car.getYear()) {
                oldestYear = car.getYear();
            }
        }
        System.out.println("The oldest car is: ");
        for (Cars car : cars) {
            if (oldestYear == car.getYear()) {
                System.out.println(car);
            }
        }
    }

    void countCarsByYear(List<Cars> cars) {
        Map<Integer, Integer> yearCounts = new HashMap<>();

        for (Cars car : cars) {
            int year = car.getYear();
            yearCounts.put(year, yearCounts.getOrDefault(year, 0) + 1);
        }

        System.out.println("Statistics by year: ");
        for (Map.Entry<Integer, Integer> entry : yearCounts.entrySet()) {
            System.out.println("Év: " + entry.getKey() + " → " + entry.getValue() + " db autó");
        }
    }

    void countCarByBrand(List<Cars> cars) {
        Map<String, Integer> brandCounts = new HashMap<>();

        for (Cars car : cars) {
            String brand = car.getBrand();
            brandCounts.put(brand, brandCounts.getOrDefault(brand, 0) + 1);
        }

        System.out.println("Static by brand: ");
        for (Map.Entry<String, Integer> entry : brandCounts.entrySet()) {
            System.out.println("Márka: " + entry.getKey() + " → " + entry.getValue() + " db autó");
        }
    }

    void writeDieselCarsToFile(List<Cars> cars) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dizel.txt"))) { //try with resources??
            for (Cars car : cars) {
                if ("dízel".equalsIgnoreCase(car.getFuelType())) {
                    writer.write(car.toString());
                    writer.newLine();
                }
            }
            System.out.println("A dízel autók sikeresen kiírva a dizel.txt fájlba.");
        } catch (IOException e) {
            System.out.println("Hiba történt a fájl írása közben: " + e.getMessage());
        }
    }
}

