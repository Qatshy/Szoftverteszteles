package hu.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        // Minden teszt előtt létrehozunk egy új számlát
        account = new BankAccount(); 
    }

    // 1
    @Test
    public void testNewAccount() {
        int balance = account.getBalance();
        assertEquals(0, balance, "new account has 0 balance");
    }

    // 2
    @Test
    public void testDeposit1000() {
        account.deposit(1000);
        int balance = account.getBalance();
        assertEquals(1000, balance, "account should have 1000");
    }

    // 3
    @Test
    public void testDeposit1000And2000() {
        account.deposit(1000);
        account.deposit(2000);
        int balance = account.getBalance();
        assertEquals(3000, balance, "account should have 3000");
    }

    // 4
    @Test
    public void testWithdraw1000() {
        account.deposit(4000);
        account.withdraw(1000);
        int balance = account.getBalance();
        assertEquals(3000, balance, "account should have 3000");
    }

    // 5
    @Test
    public void testWithdrawEverything() {
        account.deposit(3000);
        account.withdraw(3000);
        int balance = account.getBalance();
        assertEquals(0, balance, "account should have 0");
    }

    // 6
    @Test
    public void testWithdrawTooMuch() {
        account.deposit(2000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(3000);
        }, "IllegalArgumentException for withdrawing too much");
    }

    // 7
    @Test
    public void testDepositNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-1);
        }, "IllegalArgumentException for negative deposit");
    }

    // 8
    @Test
    public void testDepositZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        }, "IllegalArgumentException for 0 deposit");
    }

    // 9
    @Test
    public void testWithdrawNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-1);
        }, "IllegalArgumentException for negative withdrawal");
    }

    // 10
    @Test
    public void testWithdrawZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(0);
        }, "IllegalArgumentException for 0 withdrawal");
    }
}