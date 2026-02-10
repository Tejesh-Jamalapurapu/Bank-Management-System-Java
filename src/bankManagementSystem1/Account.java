package bankManagementSystem1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private int accountNumber;
    private String name;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(int accountNumber, String name, double balance) {
        if (balance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        transactions.add(new Transaction("ACCOUNT CREATED", balance));
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new InvalidAmountException("Deposit amount must be positive");

        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount));
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new InvalidAmountException("Withdraw amount must be positive");
        if (amount > balance)
            throw new InvalidAmountException("Insufficient balance");

        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
    }
}