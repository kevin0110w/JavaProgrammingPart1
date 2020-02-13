
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int smallest = 9999;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            if (number < smallest) {
                smallest = number;
            }
            numbers.add(number);
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < numbers.size(); i++) {
            if (smallest == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
