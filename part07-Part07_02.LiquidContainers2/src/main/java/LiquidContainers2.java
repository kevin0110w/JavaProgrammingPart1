
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            System.out.println("");

            String[] commands = input.split(" ");
            String command = commands[0];
            int volume = Integer.valueOf(commands[1]);

            if (command.equals("add") && volume > 0) {
                firstContainer.add(volume);
            } else if (command.equals("move") && volume > 0) {
                if (firstContainer.contains() >= volume) {
                    secondContainer.add(volume);
                } else {
                    secondContainer.add(firstContainer.contains());
                }
                firstContainer.remove(volume);
            } else if (command.equals("remove") && volume > 0) {
                secondContainer.remove(volume);
            }

        }

    }
}
