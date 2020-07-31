
import java.util.Scanner;

public class AnotherProgramMain {
    public static void main(String[] args) {
        System.out.print("Enter recipe file name: ");
        Scanner scanner = new Scanner(System.in);
        RecipeList recipes = new RecipeList();
        RecipeUserInterface ui = new RecipeUserInterface(recipes);

        ui.readRecipeFile(scanner.nextLine());

    }
}