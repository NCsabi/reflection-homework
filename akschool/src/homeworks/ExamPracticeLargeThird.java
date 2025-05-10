package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class ExamPracticeLargeThird {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateTribonacciSequence()));
        scanner.close();
    }

    public static int[] generateTribonacciSequence() {
        int[] numbers = new int[10];
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the " + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 3; i < numbers.length; i++) {
            numbers[i] = numbers[i - 3] + numbers[i - 2] + numbers[i - 1];
        }
        return numbers;
    }
}
