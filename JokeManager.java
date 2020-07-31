import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokesList;

    public JokeManager() {
        this.jokesList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokesList.add(joke);
    }

    public String drawJokes() {
        Random random = new Random();
        int index = random.nextInt(this.jokesList.size() - 1);

        return this.jokesList.get(index);
    }

    public void printJokes() {
        for (String joke : jokesList) {
            System.out.println(joke);
        }
    }
}