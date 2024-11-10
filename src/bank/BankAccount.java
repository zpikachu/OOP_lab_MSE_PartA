/*
  5) Develop a Java application to implement bank applications that
 perform deposit() and withdraw() operations using packages. Also write
 a checkCurrentBal() function to verify the amount credited and debited
 based on the operations performed.
 */
// BankAccount.java
package bank;

public class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the current balance
    public void checkCurrentBal() {
        System.out.println("Current Balance: " + balance);
    }
}
