import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BigWarehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stockBalance;

    public BigWarehouse() {
        this.products = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stockBalance.put(product, stock);
    }

    public int price(String product) {
        if (this.products.containsKey(product)) {
            return this.products.get(product);
        }

        return -99;
    }

    public int stock(String product) {
        if (this.stockBalance.containsKey(product)) {
            return this.stockBalance.get(product);
        }

        return 0;
    }

    public boolean take(String product) {
        if (this.stockBalance.containsKey(product)) {
            int quantity = this.stockBalance.get(product);

            if (quantity - 1 < 0) {
                this.stockBalance.put(product, 0);
                return false;
            }

            this.stockBalance.put(product, quantity - 1);
        } else {
            return false;
        }

        return true;
    }

    public Set<String> products() {
        return this.products.keySet();
    }
}