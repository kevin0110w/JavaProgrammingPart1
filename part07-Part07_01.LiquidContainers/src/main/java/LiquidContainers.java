
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        String tail = "/100";
        int second = 0;

        while (true) {
            System.out.println("First: " + first + tail);
            System.out.println("Second: " + second + tail);
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            System.out.println("");
            String[] commands = input.split(" ");
            String command = commands[0];
            int volume = Integer.valueOf(commands[1]);

            if (command.equals("add")) {
                if (volume >= 100 || (first + volume >= 100)) {
                    first = 100;
                } else if (volume > 0 && (first + volume < 100)) {
                    first += volume;
                }
            } else if (command.equals("move")) {
                boolean greaterThanZero = volume >= 0;
                if (first < volume) {
                    second += first;
                    first = 0;
                } else if (volume >= first && greaterThanZero) {
                    first = 0;
                    second += volume;
                } else if (first > volume && greaterThanZero) {
                    first -= volume;
                    second += volume;
                }

                if (second >= 100) {
                    second = 100;
                }
            } else if (command.equals("remove")) {
                if (volume > second) {
                    second = 0;
                } else if (second >= volume) {
                    second -= volume;
                }
            }

        }

    }
}
