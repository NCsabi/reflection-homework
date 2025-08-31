package task3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeCsWriter {
    public static void write(List<Employee> employees, String outputPath) {
        write(employees, outputPath, ",");
    }

    public static void write(List<Employee> employees, String outputPath, String separator) {
        List<Employee> sorted = new ArrayList<>(employees);
        sorted.sort(Comparator.comparing(Employee::getName));

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            for (Employee e : sorted) {
                writer.println(String.join(separator,
                        e.getName(),
                        e.getDepartment(),
                        String.valueOf(e.getSalary())));
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing CSV file", e);
        }
    }
}