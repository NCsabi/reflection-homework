import java.util.Scanner;

public class FizzBuzzExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number;
        do {
            System.out.println("Please enter a number upper than 0: ");
            number = scanner.nextInt();

            for (int i = 1; i < number+1; i++) {
                if(i%3 == 0 && i%5 == 0){
                    System.out.print("FizzBuzz ");
                }else if(i%3 == 0){
                    System.out.print("Fizz ");
                }else if(i%5 == 0){
                    System.out.print("Buzz ");
                }else{
                    System.out.print(i+" ");
                }
            }
        } while (number < 1);
        scanner.close();
    }
}
