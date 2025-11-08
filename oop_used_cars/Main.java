package oop_used_cars;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TxtParser parser = new TxtParser();
        Task task = new Task();
        List<Cars> cars = parser.parseTxt("C:\\docs\\ruander\\hasznalt_autok.txt");
        //a
        for (Cars car : cars) {
            System.out.println(car);
        }
        //b
        System.out.println("Number of cars: " + task.countCars(cars));
        //c
        System.out.format("The average price of petrol cars:  %.2f", Task.calculateAveragePriceOfPetrolCars(cars));
        System.out.println();
        //d
        System.out.format("The average mileage of diesel cars: %.2f", task.getAverageMileageOfDieselCars(cars));
        System.out.println();
        //e
        System.out.println("There is a hybrid car on the list: " + task.searchHybridCar(cars));
        System.out.println();
        //f
        System.out.println("Invalid records: ");
        task.printCarsWithInvalidId(cars);
        System.out.println();
        //g
        task.addNewCar(cars);
        for (Cars car : cars) {
            System.out.println(car);
        }
        //h
        System.out.println();
        task.printNewestCar(cars);
        System.out.println();
        task.printOldestCar(cars);
        //i
        task.countCarsByYear(cars);
        //j
        task.countCarByBrand(cars);
    }
}
