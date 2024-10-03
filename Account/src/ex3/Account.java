package ex3;

class Account {
    // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        balance = 0.0;
    }

    // Two-argument constructor (initial balance)
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            balance = 0.0;
        }
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Creating an account with no-argument constructor
        Account account1 = new Account();
        account1.displayBalance();  // Expected: 0.0

        // Deposit money into account1
        account1.deposit(500);
        account1.displayBalance();  // Expected: 500.0

        // Withdraw money from account1
        account1.withdraw(200);
        account1.displayBalance();  // Expected: 300.0

        // Creating an account with initial balance
        Account account2 = new Account(1000);
        account2.displayBalance();  // Expected: 1000.0

        // Try to withdraw more than the balance in account2
        account2.withdraw(1500);    // Expected: Insufficient funds

        // Try to deposit a negative amount
        account2.deposit(-100);     // Expected: Deposit amount must be positive
    }
}
