
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String word = scanner.nextLine();
            if (word.isEmpty()) {
                break;
            }
            String[] pieces = word.split(" ");
            
            for (String aWord : pieces) {
                if (aWord.toLowerCase().contains("av")) {
                    System.out.println(aWord);
                }
            }
        }


    }
}
