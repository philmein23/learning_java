import java.util.ArrayList;

public class Box implements Packable {
    private double maximumWeight;
    private ArrayList<Packable> items;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public double weight() {
        return this.items.stream().map(item -> item.weight()).mapToDouble(Double::valueOf).sum();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        return String.format("Box: %d items, total weight %.1f", this.items.size(), this.weight());
    }

}