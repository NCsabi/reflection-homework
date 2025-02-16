import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 5) {
            System.out.println("The number is biggest than five");
        } else {
            System.out.println("The number is not biggest than five");
        }


    }
}