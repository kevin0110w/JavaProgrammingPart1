
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameOfOldest = "";
        while (true) {
            String namesAndAges = scanner.nextLine();
            if (namesAndAges.isEmpty()) {
                break;
            }
            String[] pieces = namesAndAges.split(",");
            if (Integer.valueOf(pieces[1]) >= oldest) {
                oldest = Integer.valueOf(pieces[1]);
                nameOfOldest = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
