import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = this.totalWeight();

        if (currentWeight + suitcase.totalWeight() < this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        return this.suitcases.stream().map(x -> x.totalWeight()).mapToInt(Integer::intValue).sum();
    }

    public String toString() {
        return String.format("%d suitcases (%d kg)", this.suitcases.size(), this.totalWeight());
    }

    public void printItems() {
        this.suitcases.forEach(s -> s.printItems());
    }
}