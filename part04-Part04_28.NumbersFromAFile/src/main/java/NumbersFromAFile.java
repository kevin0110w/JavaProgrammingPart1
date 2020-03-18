
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        try {
            Scanner reader = new Scanner(Paths.get(file));
            while (reader.hasNext()) {
                int number = Integer.valueOf(reader.nextLine());
                if (withinBoundary(number, lowerBound, upperBound)) {
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.print("Numbers: " + counter);
    }

    private static boolean withinBoundary(int number, int lowerBound, int upperBound) {
        return (number >= lowerBound && number <= upperBound);
    }
}
