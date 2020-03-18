
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
public class Controller {

    private View v;
    private Model m;
    private Scanner reader;
    private String fileName;

    public Controller(View v, Model m) {
        this.v = v;
        this.m = m;
        this.reader = new Scanner(System.in);
    }

    public void printFileToReadMessage() {
        this.v.printFileToRead();
    }

    public void printCommands() {
        this.v.printCommands();
    }

    public void printEnterCommand() {
        this.v.printEnterCommand();
    }

    public void getFileName() {
        this.fileName = this.reader.nextLine();
    }

    public void createFileReader() {
        FileReader f = new FileReader(this.fileName);
        getRecipesFromFile(f);
    }

    private void getRecipesFromFile(FileReader f) {
        List<Recipe> recipes = f.readFile();
        addRecipesToModel(recipes);
    }

    private void addRecipesToModel(List<Recipe> recipes) {
        for (Recipe r : recipes) {
            this.m.addRecipe(r);
        }
    }

    public void getSpecificRecipeByName(String query) {
        List<Recipe> specificRecipes = this.m.getSpecificRecipes(query);
        this.v.printAllRecipes(specificRecipes);
    }

    public void getSpecificRecipeByMaxTime(int cookingTime) {
        List<Recipe> specificRecipesByTime = this.m.getSpecificRecipesByTime(cookingTime);
        this.v.printAllRecipes(specificRecipesByTime);
    }

    public void getSpecificRecipesByIngredients(String query) {
        List<Recipe> specificRecipesByIngredients = this.m.getSpecificRecipesByIngredients(query);
        this.v.printAllRecipes(specificRecipesByIngredients);
    }

    public void getAllRecipes() {
        List<Recipe> allRecipes = this.m.getRecipes();
        this.v.printAllRecipes(allRecipes);
    }

    public void start() {
        this.v.printFileToRead();
        this.getFileName();
        this.createFileReader();
        this.v.printCommands();

        while (true) {
            this.v.printEnterCommand();
            String command = this.reader.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                this.getAllRecipes();
            } else if (command.equals("find name")) {
                this.v.printSearchedWord();
                String query = this.reader.nextLine();
                this.getSpecificRecipeByName(query);
            } else if (command.equals("find cooking time")) {
                this.v.printMaxCookingTime();
                int time = Integer.valueOf(this.reader.nextLine());
                this.getSpecificRecipeByMaxTime(time);
            } else if (command.equals("find ingredient")) {
                this.v.printIngredient();
                String ingredient = this.reader.nextLine();
                this.getSpecificRecipesByIngredients(ingredient);
            }
        }
    }
}
