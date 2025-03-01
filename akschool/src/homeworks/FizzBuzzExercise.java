package homeworks;

import java.util.Scanner;

public class FizzBuzzExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number;
        do {
            System.out.println("Please enter a number greater than 0: ");
            number = scanner.nextInt();

            for (int i = 1; i < number + 1; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } while (number < 1);
        scanner.close();
    }
}