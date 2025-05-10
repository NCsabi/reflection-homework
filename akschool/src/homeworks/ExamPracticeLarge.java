package homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamPracticeLarge {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sumEverySecondValue(generateFactorialListAndSumEverySecond(getValidNumberInput())));
        scanner.close();
    }

    public static int sumEverySecondValue(List<Long> numbers) {
        int counter = 0;
        for (int i = 1; i < numbers.size(); i += 2) {
            counter += numbers.get(i);
        }
        return counter;
    }

    public static List<Long> generateFactorialListAndSumEverySecond(int validNumberInput) {
        List<Long> factorialNumbers = new ArrayList<>();
        long number = 1;
        for (int i = 1; number < validNumberInput; i++) {
            factorialNumbers.add(number);
            number *= i;
        }
        return factorialNumbers;
    }

    public static int getValidNumberInput() {
        int number;
        do {
            System.out.println("Please enter a number between 20 and 1_000_000");
            number = scanner.nextInt();
        } while (number < 20 || number > 1000000);
        return number;
    }
}