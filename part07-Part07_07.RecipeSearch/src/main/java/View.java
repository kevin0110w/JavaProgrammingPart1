
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author woohoo
 */
public class View {

    public void printFileToRead() {
        System.out.print("File to read: ");

    }

    public void printCommands() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by name");
        System.out.println("find ingredient - searches recipes by name");
    }

    public void printAllRecipes(List<Recipe> recipes) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe r : recipes) {
            System.out.println(r);
        }
    }

    public void printEnterCommand() {
        System.out.println("");
        System.out.print("Enter command: ");
    }

    public void printSearchedWord() {
        System.out.print("Searched word: ");

    }

    public void printMaxCookingTime() {
        System.out.print("Max cooking time: ");

    }

    public void printIngredient() {
        System.out.print("Ingredient: ");

    }
}
