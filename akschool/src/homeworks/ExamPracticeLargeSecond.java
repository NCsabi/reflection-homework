package homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamPracticeLargeSecond {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(generatePerfectSquaresAndSumEveryFifth(getValidNumberInput()));
        scanner.close();
    }

    public static List<Integer> generatePerfectSquaresAndSumEveryFifth(int validNumberInput) {
        List<Integer> perfectSquares = new ArrayList<>();
        int index = 1;
        while (Math.pow(index, 2) < validNumberInput) {
            perfectSquares.add((int) Math.pow(index, 2));
            index++;
        }
        return perfectSquares;
    }

    public static int getValidNumberInput() {
        int number;
        do {
            System.out.println("Please enter a number between 50 and 10000: ");
            number = scanner.nextInt();
        } while (number < 50 || number > 10000);
        return number;
    }
}
