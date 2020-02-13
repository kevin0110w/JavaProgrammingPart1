
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countYears = 0;
        int countPerson = 0;
        String longestName = "";
        double average = 0.0;
        while (true) {
            String namesAndAges = scanner.nextLine();
            if (namesAndAges.isEmpty()) {
                break;
            }
            String[] pieces = namesAndAges.split(",");
            if (pieces[0].length() >= longestName.length()) {
                longestName = pieces[0];
            }
            countYears += Integer.valueOf(pieces[1]);
            countPerson++;
        }
        average = (1.0 * countYears)/ countPerson;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
