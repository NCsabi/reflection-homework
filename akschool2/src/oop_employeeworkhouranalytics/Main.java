package oop_employeeworkhouranalytics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkHourParser workHourParser = new WorkHourParser();
        List<oop_employeeworkhouranalytics.Employee> employees = workHourParser.parseCsv("c:\\docs\\employee_hours.csv");
        System.out.println(employees);
        EmployeeAnalytics analytics = new EmployeeAnalytics();
        System.out.println("Total weekly hours: " + analytics.getWeeklyHours(employees));
        System.out.println("Total weekly average hours: " + analytics.getAverageHours(employees));
    }
}
