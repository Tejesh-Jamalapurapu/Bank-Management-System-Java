package bankManagementSystem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankService bankService = new BankService();

		while (true) {
			System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Check Balance");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Create Account selected");
				int accNo =sc.nextInt();
				System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Initial Balance: ");
                double bal = sc.nextDouble();
                Account account = new Account(accNo, name, bal);
                bankService.addAccount(account);
				break;

			case 2:
				System.out.println("Deposit Money selected");
				bankService.deposit(sc.nextInt(), sc.nextDouble());
				break;

			case 3:
				System.out.println("Withdraw Money selected");
				bankService.withdraw(sc.nextInt(), sc.nextDouble());
				break;

			case 4:
				System.out.println("Check Balance selected");
				bankService.checkBalance(sc.nextInt());
				break;

			case 5:
				System.out.println("Thank you for using Bank Management System");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
		

	}
}
