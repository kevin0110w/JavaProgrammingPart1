
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");

            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            if (userNum > 0) {
                sum = sum + userNum;
                totalNumbers = totalNumbers + 1;
            }
        }

        if (totalNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = ((double) sum) / totalNumbers;
            System.out.println(average);
        }
    }
}
