
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] pieces = words.split(" ");
            if (pieces.length >= 1) {
                System.out.println(pieces[pieces.length-1]);
            }
        }

    }
}
