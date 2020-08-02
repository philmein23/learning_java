public class Item {
    private String name;
    private int qty;
    private int unitPrice;

    public Item(String name, int qty, int unitPrice) {
        this.name = name;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity() {
        this.qty += 1;
    }

    public String toString() {
        return String.format("%s: %d", this.name, this.qty);
    }

}