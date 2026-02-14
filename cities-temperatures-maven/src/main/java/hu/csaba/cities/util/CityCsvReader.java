package hu.csaba.cities.util;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import hu.csaba.cities.model.City;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CityCsvReader {
    public List<City> readCities(String path) {
        List<City> cities = new ArrayList<>();
        try (CSVReader reader = new CSVReaderBuilder(new FileReader(path))
                .withCSVParser(new CSVParserBuilder().withSeparator(';').build())
                .build()) {
            String[] line;

            while ((line = reader.readNext()) != null) {
                cities.add(new City(line[0], Double.parseDouble(line[1])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cities;
    }
}
