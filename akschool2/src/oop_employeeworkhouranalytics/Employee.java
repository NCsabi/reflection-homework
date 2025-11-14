package oop_employeeworkhouranalytics;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private List<Integer> dailyHours;

    public void addDailyHour(int hour) {
        this.dailyHours.add(hour);
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        this.dailyHours = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<Integer> getDailyHours() {
        return dailyHours;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s, Department: %s, Daily Hours: %s\n",
                name, department, dailyHours.toString()
        );
    }
}
