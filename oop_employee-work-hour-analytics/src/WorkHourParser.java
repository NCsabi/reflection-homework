import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkHourParser {
    public List<Employee> readCsv(String filepath) {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            List<String> lines = Files.readAllLines(Path.of(filepath));
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] splitLine = line.split(",");

                if (splitLine.length != 7) {
                    System.err.println("Invalid input: " + Arrays.toString(splitLine));
                } else {
                    List<Integer> hours = new ArrayList<>();
                    for (int j = 2; j < splitLine.length; j++) {
                        hours.add(Integer.parseInt(splitLine[j]));
                    }
                    System.out.println("Parsed hours for " + splitLine[0] + ":" + hours); //itt debugolok, hogy lássam jó-e a ciklus feltöltés
                    employees.add(new Employee(splitLine[0], splitLine[1], hours));
                }
            }
        } catch (IOException e) {
            System.err.println("File not found");
            throw new RuntimeException(e);
        }
        return employees;
    }
}