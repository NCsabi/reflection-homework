package hu.csaba.cities.service;

import hu.csaba.cities.model.City;

import java.util.Comparator;
import java.util.List;

public class CityService {
    public City getHottestCity(List<City> cities) {
        return cities.stream().
                max(Comparator.comparing(City::getTemperature)).
                orElse(null);
    }

    public City getColdestCity(List<City> cities) {
        return cities.stream().
                min(Comparator.comparing(City::getTemperature)).
                orElse(null);
    }

    public double getAverageTemperature(List<City> cities) {
        return cities.stream().
                mapToDouble(City::getTemperature).
                average().
                orElse(0);

    }

    public City getCityClosestToAverage(List<City> cities) {
        double avg = getAverageTemperature(cities);
        return cities.stream().
                min(Comparator.comparingDouble(c -> Math.abs(c.getTemperature() - avg))).
                orElse(null);
    }
}
