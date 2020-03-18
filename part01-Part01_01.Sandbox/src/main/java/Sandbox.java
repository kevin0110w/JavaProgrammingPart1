
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sandbox {

    public static void main(String[] args) {
        String input = "";
       List<String> x = new ArrayList<>();
       alterList(x);
        System.out.println(x.size());
    }

    private static void alterList(List<String> x) {
        x.add("Hello");
    }
}
