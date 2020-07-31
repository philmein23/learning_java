import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String, String> translation;

    public SimpleDictionary() {
        this.translation = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        this.translation.put(word, translation);
    }

    public String translate(String word) {
        return this.translation.get(word);
    }

}