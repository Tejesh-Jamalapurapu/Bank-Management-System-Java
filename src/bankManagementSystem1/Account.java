package bankManagementSystem1;
import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        if (balance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new InvalidAmountException("Deposit must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new InvalidAmountException("Withdraw must be positive");
        if (amount > balance)
            throw new InvalidAmountException("Insufficient balance");
        balance -= amount;
    }
}