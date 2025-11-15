import java.util.List;

public class Employee {
    private String name;
    private String department;
    private List<Integer> workHour;

    public Employee(String name, String department, List<Integer> workHour) {
        this.name = name;
        this.department = department;
        this.workHour = workHour;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<Integer> getWorkHour() {
        return workHour;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", workHour=" + workHour + "]";
    }

    public int getTotalHours() {
        int count = 0;
        for (Integer hour : workHour) {
            count += hour;
        }
        return count;

    }

    public double getAverageHours() {
        return (double) getTotalHours() / workHour.size();
    }
}

