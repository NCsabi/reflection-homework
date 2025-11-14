package oop_employeeworkhouranalytics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        oop_employeeworkhouranalytics.WorkHourParser workHourParser = new oop_employeeworkhouranalytics.WorkHourParser();
        List<oop_employeeworkhouranalytics.Employee> employees = workHourParser.parseCsv("c:\\docs\\employee_hours.csv");
        System.out.println(employees);
        oop_employeeworkhouranalytics.EmployeeAnalytics employeeAnalytics = new oop_employeeworkhouranalytics.EmployeeAnalytics();
        System.out.println("Total weekly hours: " + oop_employeeworkhouranalytics.EmployeeAnalytics.getWeeklyHours(employees));
        System.out.println("Total weekly average hours: " + oop_employeeworkhouranalytics.EmployeeAnalytics.getAverageHours(employees));
    }
}
