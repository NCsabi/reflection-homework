import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAnalytics {
    void printEmployeeStats(Employee employee) {
        System.out.println(employee.getName() + " (" + employee.getDepartment() + ")");
        System.out.println(" Total hours: " + employee.getTotalHours());
        System.out.println(" Average hours: " + employee.getAverageHours());
    }

    void printAllEmployeeStats(List<Employee> employees) {
        for (Employee employee : employees) {
            printEmployeeStats(employee);
        }
    }

    void calculateDepartmentAverage(List<Employee> employees, String department) {
        int sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                sum += employee.getTotalHours();
                count++;
            }
        }
        double avg = (count == 0) ? 0 : (double) sum / count;
        System.out.println("Department " + department + " average weekly hours: " + avg);
    }

    void findTopEmployee(List<Employee> employees) {
        Employee emp = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getTotalHours() > emp.getTotalHours()) {
                emp = employee;
            }
        }
        System.out.println("The worker who works the most hours: " + emp.getName() + ", " + emp.getDepartment()
                + ". Total hours: " + emp.getTotalHours() + " hours");
    }

    void findTopEmployeePerDepartment(List<Employee> employees) {
        Map<String, Employee> topEmployees = new HashMap<>();
        for (Employee employee : employees) {
            String dep = employee.getDepartment();

            if (!topEmployees.containsKey(dep) || employee.getTotalHours() > topEmployees.get(dep).getTotalHours()) {
                topEmployees.put(dep, employee);
            }
        }
        for (Map.Entry<String, Employee> entry : topEmployees.entrySet()) {
            Employee top = entry.getValue();
            System.out.println("Department: " + entry.getKey() +
                    " -> Top employee: " + top.getName() +
                    " (" + top.getTotalHours() + " hours)");
        }
    }
}