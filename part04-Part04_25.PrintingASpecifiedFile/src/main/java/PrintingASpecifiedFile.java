
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        try {
            Scanner reader = new Scanner(Paths.get(fileName));
            while (reader.hasNext()) {
                System.out.println(reader.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
