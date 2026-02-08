package bankManagementSystem1;

public class Account {
	private int accountNumber;
	private String holderName;
	private double balance;

	public Account(int accountNumber, String holderName, double balance) {
		if (balance < 0) {
			throw new InvalidAmountException("Initial balance cannot be negative");
		}
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new InvalidAmountException("Deposit amount must be greater than zero");
		}
		balance += amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new InvalidAmountException("Withdraw amount must be greater than zero");
		}
		if (amount > balance) {
			throw new InvalidAmountException("Insufficient balance");
		}
		balance -= amount;
		System.out.println("Withdrawal successful. New balance: " + balance);
	}

}
