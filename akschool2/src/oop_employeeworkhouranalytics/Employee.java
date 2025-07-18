package oop_employeeworkhouranalytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private String department;
    private List<Integer> dailyHours;

    public void addDailyHour(int hour) {
        this.dailyHours.add(hour);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(dailyHours, employee.dailyHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, dailyHours);
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
