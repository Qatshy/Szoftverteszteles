package hu.example;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Az összegnek nagyobbnak kell lennie 0-nál.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Érvénytelen összeg vagy nincs elegendő egyenleg.");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}