
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greatest = number1;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                if (number2 > greatest) {
                    greatest = number2;
                }
            } else if (i == 2) {
                if (number3 > greatest) {
                    greatest = number3;
                }
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
