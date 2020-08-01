public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }

    public String history() {
        return this.changeHistory.changes.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);

        this.changeHistory.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);

        this.changeHistory.add(this.getBalance());

        return amountTaken;
    }

    public void printAnalysis() {
        System.out.println(String.format("Product: %s", this.getName()));
        System.out.println(String.format("History: %s", this.history()));
        System.out.println(String.format("Largest amount of product: %s", this.changeHistory.maxValue()));
        System.out.println(String.format("Smallest amount of product: %s", this.changeHistory.minValue()));
        System.out.println(String.format("Average: %s", this.changeHistory.average()));
    }
}