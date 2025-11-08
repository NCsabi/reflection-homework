package oop_used_cars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TxtParser {
    public List<Cars> parseTxt(String filePath) {
        List<Cars> cars = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] splitLine = line.split("\t");

                if (splitLine.length != 9) {
                    System.err.println("Invalid input: " + Arrays.toString(splitLine));
                } else {
                    cars.add(new Cars(
                            splitLine[0],
                            splitLine[1],
                            splitLine[2],
                            Integer.parseInt(splitLine[3]),
                            Integer.parseInt(splitLine[4]),
                            Integer.parseInt(splitLine[5]),
                            Integer.parseInt(splitLine[6]),
                            Integer.parseInt(splitLine[7]),
                            splitLine[8]
                    ));
                }
            }
        } catch (IOException e) {
            System.err.println("File not found!");
            throw new RuntimeException(e);
        }
        return cars;
    }
}
