import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int cookingTime) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public void printIngredients() {
        for (String ingredient: ingredients) {
            System.out.println(ingredient);
        }
    }

    public String toString() {
        return String.format("%s, cooking time: %d", this.recipeName, this.cookingTime);
    }
}