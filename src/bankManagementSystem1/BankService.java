package bankManagementSystem1;

import java.util.ArrayList;
import java.util.List;

public class BankService {
	private List<Account> accounts = new ArrayList<>();

	public void addAccount(Account account) {
		accounts.add(account);
		System.out.println("Account created successfully!");
	}

	private Account findAccount(int accNo) {
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo) {
				return acc;
			}
		}
		return null;
	}

	public void deposit(int accNo, double amount) {
		Account acc = findAccount(accNo);
		if (acc == null) {
			System.out.println("Account not found!");
			return;
		}

		try {
			acc.deposit(amount);
		} catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}

	public void withdraw(int accNo, double amount) {
		Account acc = findAccount(accNo);
		if (acc == null) {
			System.out.println("Account not found!");
			return;
		}

		try {
			acc.withdraw(amount);
		} catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}

	public void checkBalance(int accNo) {
		Account acc = findAccount(accNo);
		if (acc != null) {
			System.out.println("Balance: " + acc.getBalance());
		} else {
			System.out.println("Account not found!");
		}
	}
}
