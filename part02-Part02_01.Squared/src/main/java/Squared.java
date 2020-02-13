
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt = Integer.valueOf(scanner.nextLine());
        int secondPower = userInt * userInt;
        System.out.println(secondPower);
    }
}
