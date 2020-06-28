package bankingApplication;
import java.util.*;
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size = 0;
		double[] accountBalances = new double[200];
		String[] accountNames = new String[200];
		while(true) {
			System.out.println("Bank Administrator access only: ");
			System.out.println("Please select an option: ");
			System.out.println("[1] : Add a customer to the bank");
			System.out.println("[2] : Change the name of the customer");
			System.out.println("[3] : Check customer's account balance");
			System.out.println("[4] : Modify their account balance");
			System.out.println("[5] : Summary of all account in the bank");
			System.out.println("[-1] : Quit");
			
			int userInput = in.nextInt();
			if(userInput == 1) {
				System.out.println("Adding a customer...");
				System.out.println("Enter the amount deposited by the customer: ");
				double balance = in.nextDouble();
				accountBalances[size] = balance;
				System.out.println("Enter the customer's full name");
				in.nextLine();
				String name = in.nextLine();
				accountNames[size] = name;
				System.out.println("Customer's ID is : " +size);
				size = size + 1;
			}
			else if(userInput == 2) {
				System.out.println("Requesting name change...");
				System.out.println("Enter the customer ID: ");
				int index = in.nextInt();
				System.out.println("Update the new name: ");
				in.nextLine();
				accountNames[index] = in.nextLine();
			}
			else if(userInput == 3) {
				System.out.println("Checking account balance...");
				System.out.println("Enter the customer ID: ");
				int index = in.nextInt();
				double balance = accountBalances[index];
				System.out.println("This customer has rupees "+ balance + " in their account");
			}
			else if(userInput == 4) {
				System.out.println("Accessing account data...");
				System.out.println("Enter customer ID: ");
				int index = in.nextInt();
				System.out.println("Update customer's account balance: ");
				accountBalances[index] = in.nextDouble();
			}
			else if(userInput == 5) {
				System.out.println("Account summary of all bank customers: ");
				double total = 0;
				for(int i = 0; i < size; i++) {
					total = total + accountBalances[i];
					System.out.println(accountNames[i] + " has rupees " + accountBalances[i] + " in their account");
				}
				System.out.println("Total amount in bank: " +total);
			}
			else if(userInput == -1) {
				System.exit(-1);
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}
}
