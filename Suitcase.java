import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item itemToAdd) {
        if (this.totalWeight() + itemToAdd.getWeight() <= this.maximumWeight) {
            this.items.add(itemToAdd);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Item item : items) {
            currentWeight += item.getWeight();
        }

        return currentWeight;
    }

    public Item heaviestItem() {
        Item heaviest = this.items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "No items (0 kg)";
        }

        return String.format("%d items (%d kg)", this.items.size(), this.totalWeight());
    }
}