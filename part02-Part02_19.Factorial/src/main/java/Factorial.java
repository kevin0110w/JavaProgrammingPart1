
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number:");
        int userNumber = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        if (userNumber == 0 || userNumber == 1) {
            System.out.println("Factorial: " + factorial);
        } else {
            for (int i = 2; i <= userNumber; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial: " + factorial);
        }
    }
}
