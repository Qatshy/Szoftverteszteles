class BankAccount {
    constructor() {
        this.balance = 0;
    }
    Deposit(amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        else {
            throw new Error("IllegalArgumentException");
        }
    }
    Withdraw(amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            throw new Error("IllegalArgumentException");
        }
    }
    GetBalance() {
        return this.balance;
    }
}