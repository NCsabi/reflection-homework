import java.util.Scanner;

public class LoopsBasicTasks {
    public static void main(String[] args) {

        System.out.println("Loop one: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Paper Dragon ");
        }
        System.out.println();
        System.out.println("Loop two: ");
        for (int i = 1; i < 31; i++) {
            if (i == 30) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println("Loop three: ");
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                if (i == 500) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }
        System.out.println();
        System.out.println("Loop four: ");
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 1) {
                if (i == 499) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }
        System.out.println();
        System.out.println("Loop five: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();
        System.out.println("Loop six: ");
        for (double i = 565.5; i <= 678.5; i += 0.25) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Loop seven: ");
        for (int i = 600; i < 751; i += 30) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Loop eight: ");
        int amount = 0;
        for (int i = 1; i < 11; i++) {
            amount += i;
        }
        System.out.println(amount);
        System.out.println("Loop nine: ");
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 21; i++) {
            sum += i;
            count++;
        }
        System.out.print((double) sum / count);
        System.out.println();
        System.out.println("Loop ten: ");
        for (int i = 1; Math.pow(i, 2) <= 1000; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }
        System.out.println();
        System.out.println("Loop eleven: ");
        for (int i = 1; Math.pow(i, 3) <= 1250; i++) {
            System.out.print((int) Math.pow(i, 3) + " ");
        }
        System.out.println();

        
        System.out.println("Loop twelve: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("The number is a prime");
        } else {
            System.out.println("The number is not a prime");
        }
        scanner.close();
    }
}
