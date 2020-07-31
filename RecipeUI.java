import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeUI {
    public static void main(String[] args) {
        System.out.print("Enter recipe file name: ");
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();
        ArrayList<String> rows = new ArrayList<>();
        RecipeList recipeList = new RecipeList();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
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

                    recipeList.addRecipe(recipe);
                    rows.clear();
                }
            }

            List<Recipe> foundRecipes = recipeList.findRecipeByName("balls");

            for (Recipe recipe : foundRecipes) {
                System.out.println(recipe);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}