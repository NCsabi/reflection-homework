package hu.csaba.cities.app;

import hu.csaba.cities.model.City;
import hu.csaba.cities.service.CityService;
import hu.csaba.cities.util.CityCsvReader;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        CityCsvReader reader = new CityCsvReader();
        List<City> cities = reader.readCities("src/main/resources/temperatures.csv");
        CityService service = new CityService();
        System.out.println("Hottest: " + service.getHottestCity(cities));
        System.out.println("Coldest: " + service.getColdestCity(cities));
        System.out.println("Average: " + service.getAverageTemperature(cities));
        System.out.println("Closest to average: " + service.getCityClosestToAverage(cities));
    }
}
