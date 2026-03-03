import hu.csaba.cities.model.City;
import hu.csaba.cities.util.CityCsvReader;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class CityCsvReaderTest {
    CityCsvReader reader = new CityCsvReader();

    @Test
    void testNonExistingFile() {
        List<City> result = reader.readCities("does not exist.csv");
        assertTrue(result.isEmpty());
    }

    @Test
    void testEmptyFile() throws Exception {
        Path temp = Files.createTempFile("cities", ".csv");
        List<City> result = reader.readCities(temp.toString());
        assertTrue(result.isEmpty());
    }

    @Test
    void testMalformedLine() throws Exception {
        Path temp = Files.createTempFile("cities", ".csv");
        try (FileWriter fw = new FileWriter(temp.toFile())) {
            fw.write("Budapest\n");
        }

        List<City> result = reader.readCities(temp.toString());
        assertTrue(result.isEmpty());
    }
}
