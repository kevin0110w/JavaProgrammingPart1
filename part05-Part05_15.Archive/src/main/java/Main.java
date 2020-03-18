
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            Item anItem = new Item(name, identifier);
            if (!items.contains(anItem)) {
                items.add(anItem);
            }
        }
        
        System.out.println("");
        System.out.println("==Items==");
        
        for (Item i : items) {
            System.out.println(i);
        }

    }
}

