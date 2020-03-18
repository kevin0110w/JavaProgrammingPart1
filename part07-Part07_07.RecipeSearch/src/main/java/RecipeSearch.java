
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        View v = new View();
        Model m = new Model();
        Controller c = new Controller(v, m);
        c.start();
    }
}
