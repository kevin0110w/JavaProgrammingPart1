
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int userTo = Integer.valueOf(scanner.nextLine());
        System.out.print("Where to?");
        int userFrom = Integer.valueOf(scanner.nextLine());

        if (userTo >= userFrom) {

            for (int i = userFrom; i <= userTo; i++) {
                System.out.println(i);
            }
        }
    }
}
