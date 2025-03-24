package homeworks;

import java.util.Scanner;

public class SumOfPerfectSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getUserInput(scanner);
        checkNumberThreshold(number);
        System.out.println("The sum of the perfect squares of the numbers: " + calculateSumOfPerfectSquares(number));
        scanner.close();
    }

    public static int getUserInput(Scanner scanner) {
        System.out.println("Please enter a number grater than one: ");
        return scanner.nextInt();
    }

    public static void checkNumberThreshold(int number) {
        if (number < 1) {
            System.err.print("The number must be greater than 1!");
            System.exit(0);
        }
    }

    public static int calculateSumOfPerfectSquares(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += (int) Math.pow(i, 2);
        }
        return sum;
    }
}
