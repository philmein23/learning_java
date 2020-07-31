import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeUserInterface {
    private RecipeList recipes;

    public RecipeUserInterface(RecipeList recipes) {
        this.recipes = recipes;
    }

    public void readRecipeFile(String file) {
        ArrayList<String> rows = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                if (!row.isEmpty()) {
                    rows.add(row);
                }

                if (row.isEmpty() || !fileScanner.hasNextLine()) {
                    String recipeName = rows.get(0);
                    int cookingTime = Integer.valueOf(rows.get(1));
                    int limit = rows.size() - 1;

                    Recipe recipe = new Recipe(recipeName, cookingTime);

                    for (int i = 2; i <= limit; i++) {
                        recipe.addIngredient(rows.get(i));
                    }

                    this.recipes.addRecipe(recipe);
                    rows.clear();
                }
            }

            this.recipes.printRecipes();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void start() {

    }
}