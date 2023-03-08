package InvoicingSystemPackage;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InvoicingSystemTables {
	public static void main(String[] args) {
		
		
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
		
		
		
			String tableCreationHolder = "CREATE TABLE shop_settings ("
	                + "id INT PRIMARY KEY,"
	                + "shop_name VARCHAR(255)"
	                + ");"
	                +
	                "CREATE TABLE shop_items ("
	                + "id INT PRIMARY KEY,"
	                + "name VARCHAR(255),"
	                + "description VARCHAR(255),"
	                + "price int"
	                + ");"
	                +
	                "CREATE TABLE invoices ("
	                + "id INT PRIMARY KEY,"
	                + "invoice_date VARCHAR(255),"
	                + "customer_name VARCHAR(255)" 
	                + ");"
	                +
	                "CREATE TABLE invoice_items ("
	                + "invoice_id INT,"
	                + "item_id INT,"
	                + "quantity INT,"
	                + "price INT,"
	                + "FOREIGN KEY (invoice_id) REFERENCES invoices(id),"
	                + "FOREIGN KEY (item_id) REFERENCES shop_items(id)"
	                + ")";
		
			st.execute(tableCreationHolder);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			//-----------------------------------------------------------//	
		

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		
		
	}
}
