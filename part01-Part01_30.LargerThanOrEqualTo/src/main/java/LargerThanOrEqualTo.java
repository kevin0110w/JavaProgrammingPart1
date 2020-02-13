
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println("Larger number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Larger number is: " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }
                

    }
}
