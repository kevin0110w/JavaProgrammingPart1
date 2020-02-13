
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int userNum = 0;
        int sum = 0;
        int totalNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (true) {
            userNum = Integer.valueOf(scanner.nextLine());
            if (userNum == -1) {
                break;
            }
            
            if (userNum % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            sum = sum + userNum;
            totalNumbers++;
        }
        double average = ((double) sum) / totalNumbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
