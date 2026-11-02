QUnit.module("BankAccount tesztek");

//1
QUnit.test("new account", function(assert) {
    let account = new BankAccount();
    let balance = account.GetBalance();
    assert.strictEqual(balance, 0, "new account has 0 balance");
});

//2
QUnit.test("deposit 1000", function(assert) {
    let account = new BankAccount();
    account.Deposit(1000);
    let balance = account.GetBalance();
    assert.strictEqual(balance, 1000, "account should have 1000");
});

//3
QUnit.test("deposit 1000+2000", function(assert) {
    let account = new BankAccount();
    account.Deposit(1000);
    account.Deposit(2000);
   let balance = account.GetBalance();
    assert.strictEqual(balance, 3000, "account should have 3000");
});
//4 
QUnit.test("withdraw 1000", function(assert) {
    let account = new BankAccount();
    account.Deposit(4000);
    account.Withdraw(1000);
    let balance = account.GetBalance();
    assert.strictEqual(balance, 3000, "account should have 3000");
});
//5
QUnit.test("withdraw everything", function(assert) {
    let account = new BankAccount();
    account.Deposit(3000);
    account.Withdraw(3000);
    let balance = account.GetBalance();
    assert.strictEqual(balance, 0, "account should have 0");
});
//6
QUnit.test("withdraw too much", function(assert) {
    let account = new BankAccount();
   assert.throws(
    function () {
        account.Deposit(2000);
        account.Withdraw(3000);
    },
    /IllegalArgumentException/, //hiba szövegében benne legyen ez a szó
    "IllegalArgumentException for withdrawing too much"
);
});
//7
QUnit.test("withdraw negative", function(assert) {
    let account = new BankAccount();
   assert.throws(
    function () {
        account.Deposit(-1);
    },
    /IllegalArgumentException/, //hiba szövegében benne legyen ez a szó
    "IllegalArgumentException for negative deposit"
);
});
//8
QUnit.test("deposit 0", function(assert) {
    let account = new BankAccount();
   assert.throws(
    function () {
        account.Deposit(0);
    },
    /IllegalArgumentException/, //hiba szövegében benne legyen ez a szó
    "IllegalArgumentException for 0 deposit"
);
});
//9
QUnit.test("deposit 0", function(assert) {
    let account = new BankAccount();
   assert.throws(
    function () {
        account.Withdraw(-1);
    },
    /IllegalArgumentException/, //hiba szövegében benne legyen ez a szó
    "IllegalArgumentException for negative withdrawal"
);
});
//10
QUnit.test("deposit 0", function(assert) {
    let account = new BankAccount();
   assert.throws(
    function () {
        account.Withdraw(0);
    },
    /IllegalArgumentException/, //hiba szövegében benne legyen ez a szó
    "IllegalArgumentException for 0 withdrawal"
);
});