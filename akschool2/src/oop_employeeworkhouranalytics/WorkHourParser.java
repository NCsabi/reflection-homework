package oop_employeeworkhouranalytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkHourParser {
    public List<Employee> parseCsv(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] splitLine = line.split(",");
                if (splitLine.length != 7) {
                    System.err.println("Invalid input " + Arrays.toString(splitLine));
                } else {
                    String name = splitLine[0];
                    String department = splitLine[1];
                    Employee employee = new Employee(name, department);
                    for (int j = 2; j < splitLine.length; j++) {
                        int hour = Integer.parseInt((splitLine[j].trim()));
                        employee.addDailyHour(hour);
                    }
                    employees.add(employee);
                }
            }
        } catch (IOException e) {
            System.err.println("File not found");
            throw new RuntimeException(e);
        }
        return employees;
    }
}
