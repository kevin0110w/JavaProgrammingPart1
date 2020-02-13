
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String namesAndAges = scanner.nextLine();
            if (namesAndAges.isEmpty()) {
                break;
            }
            String[] pieces = namesAndAges.split(",");
            if (Integer.valueOf(pieces[1]) >= oldest) {
                oldest = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
