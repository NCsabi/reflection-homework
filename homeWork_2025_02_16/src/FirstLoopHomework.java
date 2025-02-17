import java.util.Scanner;

public class FirstLoopHomework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number upper than 0: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.err.println("The number is not upper than 0!");
        }
        scanner.nextLine();
        System.out.println("Please enter a text: ");
        String text = scanner.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.print(text+" ");

        }
        scanner.close();

    }
}