
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author woohoo
 */
public class FileReader {

    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Recipe> readFile() {
        List<Recipe> recipes = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(this.fileName))) {
            while (reader.hasNext()) {
                String name = reader.nextLine();
                if (name.isEmpty()) {
                    break;
                }
                int cookingTime = Integer.valueOf(reader.nextLine());
                Recipe r = new Recipe(name, cookingTime);
                while (reader.hasNext()) {
                    String ingredient = reader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    r.addIngredient(ingredient);
                }
                recipes.add(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return recipes;
    }
}
