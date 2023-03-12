package InvoicingSystemPackage;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Dashboard {

	public static void main(String[] args) {
		handler handler = new handler();
		String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=InvoicingSystemDB;" + "encrypt=true;"
				+ "trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			// -------------------------------------------------------------//
		
	
			
			//-----------------------------------------------------------//	
	
		con.close();
	} 
	catch (Exception ex) {
		System.err.println(ex);
	}
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
					"4- Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items,)");
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
					handler.printshop();
					System.out.println("Data loaded successfully.");
					break;
				case 2:
					// Set shop name
					handler.addShop();
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
					handler.addItems();
					System.out.println("Items added successfully.");
					break;
				case 2:
					// Delete items
					handler.deletItem();
					System.out.println("Items deleted successfully.");
					break;
				case 3:
					// Change item price
					handler.updateItem();
					System.out.println("Item price changed successfully.");
					break;
				case 4:
					// Report all items
					handler.printItem();
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
				handler.addInvoice();
				System.out.println("Invoice created successfully.");
				break;
			case 4:
				// Report all invoices
				handler.printinvoices();
				break;
			case 5:
				// Search invoice
				handler.seachinvoices();
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
