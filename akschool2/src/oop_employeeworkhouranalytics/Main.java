package oop_employeeworkhouranalytics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkHourParser workHourParser = new WorkHourParser();
        List<Employee> employees = workHourParser.parseCsv("C:\\docs\\employee_hours.csv");
        System.out.println(employees);
        EmployeeAnalytics employeeAnalytics = new EmployeeAnalytics();
        System.out.println("Total weekly hours: " + EmployeeAnalytics.getWeeklyHours(employees));
    }
}
