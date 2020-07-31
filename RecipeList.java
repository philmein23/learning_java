import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecipeList {
    private List<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public List<Recipe> findRecipeByName(String name) {
        return this.recipes.stream().filter(recipe -> recipe.getRecipeName().contains(name))
                .collect(Collectors.toList());
    }

    public List<Recipe> findRecipeByCookingTime(int cookingTime) {
        return this.recipes.stream().filter(recipe -> recipe.getCookingTime() <= cookingTime)
                .collect(Collectors.toList());
    }

    public void printRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
}