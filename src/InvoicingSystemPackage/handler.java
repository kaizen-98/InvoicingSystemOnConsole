package InvoicingSystemPackage;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class handler {
	Scanner input = new Scanner(System.in);

	public void addShop() {

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

			System.out.println("Enter The Shop Id");
			int id = input.nextInt();
			System.out.println("Enter The Shop Name");
			String shop_name = input.next();

			String inserShop = "insert into shop_settings (id,shop_name) values(" + id + ",'" + shop_name + "')";
			Integer m = st.executeUpdate(inserShop);
            if (m >= 1) {
            	System.out.println("inserted successfully : ");
} else {
System.out.println("insertion failed");
}
			// -----------------------------------------------------------//

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}
	
	public void addItems() {

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

			System.out.println("Enter The item Id");
			int id = input.nextInt();
			System.out.println("Enter The item Name");
			String item_name = input.next();
			System.out.println("write a description");
			String des = input.next();
			System.out.println("Enter The price");
			int price = input.nextInt();
			
			
			String inserShop = "insert into shop_items(id,name,description,price) values(" + id + ",'" + item_name+"','"+des+"',"+price+ ")";
			Integer m = st.executeUpdate(inserShop);
            if (m >= 1) {
            	System.out.println("inserted successfully !! ");
} else {
System.out.println("insertion failed");
}
			// -----------------------------------------------------------//

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
