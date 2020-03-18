
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        FileReader reader = new FileReader(fileName);
        reader.readFile();
        System.out.println("Team:");
        String team = scan.nextLine();
        System.out.println(reader.getTeam(team));
        
    }

}
