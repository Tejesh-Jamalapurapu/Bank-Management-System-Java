package bankManagementSystem1;

public class Account {
	private int accountNumber;
	private String holderName;
	private double balance;

	public Account(int accountNumber, String holderName, double balance) {
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
	    if (amount > 0) {
	        balance += amount;
	        System.out.println("Amount deposited successfully");
	    } else {
	    	System.out.println("Invalid deposit amount");
	    }
	}
	public boolean withdraw(double amount) {
	    if (amount > 0 && amount <= balance) {
	        balance -= amount;
	        return true;
	    }
	    return false;
	}


	public static void main(String[] args) {

	}

}
