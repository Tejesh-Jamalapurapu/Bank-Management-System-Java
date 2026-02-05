package bankManagementSystem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
				break;

			case 2:
				System.out.println("Deposit Money selected");
				break;

			case 3:
				System.out.println("Withdraw Money selected");
				break;

			case 4:
				System.out.println("Check Balance selected");
				break;

			case 5:
				System.out.println("Thank you for using Bank Management System");
				System.exit(0);

			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}

	}
}
