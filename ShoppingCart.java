import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            Item item = this.cart.get(product);
            item.increaseQuantity();
            return;
        }
        Item newItem = new Item(product, 1, price);
        this.cart.put(product, newItem);
    }

    public int price() {
        return this.cart.values().stream().map(item -> item.price()).mapToInt(Integer::valueOf).sum();
    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }

}