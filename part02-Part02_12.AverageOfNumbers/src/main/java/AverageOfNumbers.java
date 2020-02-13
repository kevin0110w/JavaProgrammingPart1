import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNumbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if (userNum == 0) {
                break;
            } 
            
            sum = sum + userNum;
            totalNumbers = totalNumbers + 1;
        }
        double average = ((double) sum) / totalNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}
