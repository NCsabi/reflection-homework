import hu.csaba.cities.model.City;
import hu.csaba.cities.service.CityService;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNull;

public class CityServiceTest {
    CityService service = new CityService();

    @Test
    void testEmptyList() {
        assertNull(service.getHottestCity(List.of()));
        assertNull(service.getColdestCity(List.of()));
        assertEquals(0.0, service.getAverageTemperature(List.of()), 0.0001);
        assertNull(service.getCityClosestToAverage(List.of()));
    }

    @Test
    void testSingleCity() {
        City c = new City("Budapest", 25);
        List<City> list = List.of(c);
        assertEquals(c, service.getHottestCity(list));
        assertEquals(c, service.getColdestCity(list));
        assertEquals(25.0, service.getAverageTemperature(list));
        assertEquals(c, service.getCityClosestToAverage(list));
    }

    @Test
    void testNormalCase() {
        List<City> cities = List.of(
                new City("A", 10.0),
                new City("B", 20),
                new City("C", 30)
        );
        assertEquals("C", service.getHottestCity(cities).getName());
        assertEquals("A", service.getColdestCity(cities).getName());
        assertEquals(20.0, service.getAverageTemperature(cities));
        assertEquals("B", service.getCityClosestToAverage(cities).getName());
    }

    @Test
    void testNegativeTemperatures() {
        List<City> cities = List.of(
                new City("A", -10.0),
                new City("B", -20.0),
                new City("C", -30.0)
        );
        assertEquals("A", service.getHottestCity(cities).getName());
        assertEquals("C", service.getColdestCity(cities).getName());
        assertEquals(-20.0, service.getAverageTemperature(cities));
    }
}
