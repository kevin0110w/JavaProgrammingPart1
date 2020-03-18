
import java.util.ArrayList;
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
public class Model {

    private List<Recipe> recipes;

    public Model() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe r) {
        this.recipes.add(r);
    }

    public List<Recipe> getRecipes() {
        return this.recipes;
    }

    public List<Recipe> getSpecificRecipes(String query) {
        List<Recipe> specificRecipes = new ArrayList<>();

        for (Recipe r : this.recipes) {
            if (r.getName().contains(query)) {
                specificRecipes.add(r);
            }
        }
        return specificRecipes;
    }

   public List<Recipe> getSpecificRecipesByTime(int cookingTime) {
        List<Recipe> specificRecipes = new ArrayList<>();
        for (Recipe r : this.recipes) {
            if (r.getCookingTime() <= cookingTime) {
                specificRecipes.add(r);
            }

        }
        return specificRecipes;
    }

   public List<Recipe> getSpecificRecipesByIngredients(String query) {
        List<Recipe> specificRecipes = new ArrayList<>();
        for (Recipe r : this.recipes) {
            for (String ingredient : r.getIngredients()) {
                if (ingredient.equals(query)) {
                    specificRecipes.add(r);
                    break;
                }
            }

        }
        return specificRecipes;
    }

}
