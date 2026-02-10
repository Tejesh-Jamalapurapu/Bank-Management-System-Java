package bankManagementSystem1;

import java.util.List;

public class BankService {

    private List<Account> accounts;

    public BankService() {
        accounts = FileUtil.loadAccounts();
    }

    private Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        FileUtil.saveAccounts(accounts);
        System.out.println("Account created successfully!");
    }

    public void deposit(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        acc.deposit(amount);
        FileUtil.saveAccounts(accounts);
        System.out.println("Deposit successful");
    }

    public void withdraw(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        acc.withdraw(amount);
        FileUtil.saveAccounts(accounts);
        System.out.println("Withdrawal successful");
    }

    public void checkBalance(int accNo) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            System.out.println("Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    public void showTransactions(int accNo) {
        Account acc = findAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }

        System.out.println("\n--- Transaction History ---");
        acc.getTransactions().forEach(System.out::println);
    }
}