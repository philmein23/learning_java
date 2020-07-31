
class Account {

    private double balance = 0.00;
    private String accountName;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double balance() {
        return this.balance;
    }

    public String getAccountName() {
        return this.accountName;
    }

}
