public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.capacity = capacity;
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapcity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0)
            return;
        if (amount <= this.howMuchSpaceLeft()) {
            this.balance += amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0;
        }

        if (amount > this.balance) {
            double leftOvertoTake = this.balance;
            this.balance = 0;

            return leftOvertoTake;
        }

        this.balance -= amount;

        return amount;
    }

    public String toString() {
        return String.format("balance = %.2f, space left = %.2f", this.balance, this.howMuchSpaceLeft());
    }
}