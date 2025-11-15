package oop_employeeworkhouranalytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAnalytics {
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

    public static List<Double> getAverageHours(List<Employee> employees) {
        List<Double> totalAverages = new ArrayList<>();
        List<Integer> weeklyTotals = getWeeklyHours(employees);

        for (int i = 0; i < employees.size(); i++) {
            int totalHours = weeklyTotals.get(i);
            int daysWorked = employees.get(i).getDailyHours().size();
            double avgHours = (double) totalHours / daysWorked;
            totalAverages.add(avgHours);
        }
        return totalAverages;
    }
    public static Map<String, Double> getDepartmentAverageHours(List<Employee> employees) {
        Map<String, Integer> departmentTotalHours = new HashMap<>();
        Map<String, Integer> departmentEmployeeCount = new HashMap<>();

        for (Employee employee : employees) {
            String department = employee.getDepartment();
            int weeklyHours = 0;
            for (int hour : employee.getDailyHours()) {
                weeklyHours += hour;
            }

            departmentTotalHours.put(department,
                    departmentTotalHours.getOrDefault(department, 0) + weeklyHours);
            departmentEmployeeCount.put(department,
                    departmentEmployeeCount.getOrDefault(department, 0) + 1);
        }

        Map<String, Double> departmentAverages = new HashMap<>();
        for (String department : departmentTotalHours.keySet()) {
            int total = departmentTotalHours.get(department);
            int count = departmentEmployeeCount.get(department);
            double average = (double) total / count;
            departmentAverages.put(department, average);
        }

        return departmentAverages;
    }
}
