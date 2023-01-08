package hw5_CustomerAndAccount;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account (int id, Customer customer, double Balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s balance = $%.2f", customer.toString(), getBalance());
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit (double amount) {
        balance = getBalance() + amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (getBalance() >= amount) {
            balance = getBalance() - amount;
            return this;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return null;
    }

}
