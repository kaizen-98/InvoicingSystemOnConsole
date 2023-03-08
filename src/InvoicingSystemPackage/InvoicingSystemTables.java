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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			//-----------------------------------------------------------//	
		

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		
		
	}
}
