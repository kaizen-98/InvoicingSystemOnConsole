package InvoicingSystemPackage;

import java.util.Scanner;

public class Dashboard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		boolean exit = false;

		while (!exit) {
			System.out.println("Main Menu:");
			System.out.println("1- Shop Settings");
			System.out.println("    1- Load Data");
			System.out.println("    2- Set Shop Name");
			System.out.println("    3- Go Back");
			System.out.println("2- Manage Shop Items");
			System.out.println("    1- Add Items");
			System.out.println("    2- Delete Items");
			System.out.println("    3- Change Item Price");
			System.out.println("    4- Report All Items");
			System.out.println("    5- Go Back");
			System.out.println("3- Create New Invoice");
			System.out.println(
					"4- Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)");
			System.out
					.println("5- Search (1) Invoice (Search by Invoice No and Report All Invoice details with items)");
			System.out.println("6- Exit");

			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Shop Settings:");
				System.out.println("    1- Load Data");
				System.out.println("    2- Set Shop Name");
				System.out.println("    3- Go Back");
				System.out.print("Enter your choice: ");
				int shopSettingsChoice = input.nextInt();

				switch (shopSettingsChoice) {
				case 1:
					// Load data
				
					System.out.println("Data loaded successfully.");
					break;
				case 2:
					// Set shop name
					System.out.print("Enter the shop name: ");
				
					System.out.println("Shop name set successfully.");
					break;
				case 3:
					// Go back
					break;
				default:
					System.out.println("Invalid choice.");
					break;
				}
				break;
			case 2:
				System.out.println("Manage Shop Items:");
				System.out.println("    1- Add Items");
				System.out.println("    2- Delete Items");
				System.out.println("    3- Change Item Price");
				System.out.println("    4- Report All Items");
				System.out.println("    5- Go Back");
				System.out.print("Enter your choice: ");
				int manageItemsChoice = input.nextInt();

				switch (manageItemsChoice) {
				case 1:
					// Add items
				
					System.out.println("Items added successfully.");
					break;
				case 2:
					// Delete items
					
					System.out.println("Items deleted successfully.");
					break;
				case 3:
					// Change item price
				
					System.out.println("Item price changed successfully.");
					break;
				case 4:
					// Report all items
					
					break;
				case 5:
					// Go back
					break;
				default:
					System.out.println("Invalid choice.");
					break;
				}
				break;
			case 3:
				System.out.println("Invoice created successfully.");
				break;
			case 4:
				// Report all invoices
				
				break;
			case 5:
				// Search invoice
				
				break;
			case 6:
				// Exit
				System.out.print("Are you sure you want to exit? (y/n): ");
				String confirmExit = input.next();
				if (confirmExit.equalsIgnoreCase("y")) {
					exit = true;
				}
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}

}
