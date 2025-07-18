package oop_employeeworkhouranalytics;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAnalytics {
    //Analízisek, amiket meg kell valósítani:
//Minden dolgozónál számold ki a heti összóraszámot
//
//Számold ki a napi átlagos óraszámot dolgozónként
//
//Számold ki az osztályonkénti heti átlagos óraszámot
//
//Találd meg:
//
//A legtöbbet dolgozó alkalmazottat összesített szinten
//
//A legtöbbet dolgozót osztályonként
    public static List<Integer> getWeeklyHours(List<Employee> employees) {
        List<Integer> weeklyTotals = new ArrayList<>();
        for (Employee employee : employees) {
            int totalHours = 0;
            for (int hour : employee.getDailyHours()) {
                totalHours += hour;
            }
            weeklyTotals.add(totalHours);
        }
        return weeklyTotals;
    }

}
