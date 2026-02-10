package bankManagementSystem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        BankService bankService = new BankService();

	        while (true) {
	            try {
	                System.out.println("\n--- Bank Management System ---");
	                System.out.println("1. Create Account");
	                System.out.println("2. Deposit");
	                System.out.println("3. Withdraw");
	                System.out.println("4. Check Balance");
	                System.out.println("5. Transaction History");
	                System.out.println("6. Exit");
	                System.out.print("Enter choice: ");

	                int choice = sc.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Account Number: ");
	                        int accNo = sc.nextInt();
	                        System.out.print("Name: ");
	                        String name = sc.next();
	                        System.out.print("Initial Balance: ");
	                        double bal = sc.nextDouble();

	                        bankService.addAccount(new Account(accNo, name, bal));
	                        break;

	                    case 2:
	                        System.out.print("Account Number & Amount: ");
	                        bankService.deposit(sc.nextInt(), sc.nextDouble());
	                        break;

	                    case 3:
	                        System.out.print("Account Number & Amount: ");
	                        bankService.withdraw(sc.nextInt(), sc.nextDouble());
	                        break;

	                    case 4:
	                        System.out.print("Account Number: ");
	                        bankService.checkBalance(sc.nextInt());
	                        break;
	                    case 5:
	                    	System.out.println("Enter Account Number: ");
	                    	bankService.showTransactions(sc.nextInt());
	                    	break;

	                    case 6:
	                        System.out.println("Exiting...");
	                        sc.close();
	                        return;

	                    default:
	                        System.out.println("Invalid option!");
	                }

	            } catch (InputMismatchException e) {
	                System.out.println("Please enter valid numeric input!");
	                sc.nextLine(); // clear buffer
	            } catch (InvalidAmountException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	}
}
