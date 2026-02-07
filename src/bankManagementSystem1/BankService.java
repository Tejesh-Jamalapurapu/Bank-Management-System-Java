package bankManagementSystem1;

import java.util.ArrayList;
import java.util.List;

public class BankService {
	private List<Account> accounts = new ArrayList<>();

    // Create account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    // Find account by account number
    private Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    // Deposit
    public void deposit(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw
    public void withdraw(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Check balance
    public void checkBalance(int accNo) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            System.out.println("Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

}
