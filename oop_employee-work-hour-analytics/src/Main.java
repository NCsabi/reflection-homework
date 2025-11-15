import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkHourParser parser = new WorkHourParser();
        EmployeeAnalytics analytics = new EmployeeAnalytics();
        List<Employee> employees = parser.readCsv("C:\\docs\\employee_hours.csv");
        System.out.println();
        analytics.printAllEmployeeStats(employees);
        System.out.println();
        analytics.calculateDepartmentAverage(employees, "Engineering");
        analytics.findTopEmployee(employees);
        analytics.findTopEmployeePerDepartment(employees);
    }
}
