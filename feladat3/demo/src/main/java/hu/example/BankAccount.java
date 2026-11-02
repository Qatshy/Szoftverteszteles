package hu.example;
public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid amount for withdrawal");
        }
    }

    public int getBalance() {
        return this.balance;
    }
}