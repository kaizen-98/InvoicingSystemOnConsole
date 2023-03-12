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
	
	public void addinvoice_items() {
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

			System.out.println("Enter The invoice Id");
			int id = input.nextInt();
			System.out.println("Enter The item Id");
			int idItem = input.nextInt();
			System.out.println("Enter The quantity");
			int quantity = input.nextInt();
			System.out.println("Enter The price");
			int price = input.nextInt();
			
			
			String inserInvoice = "insert into invoice_items(invoice_id,item_id,quantity,price) values(" + id + ","+idItem+","+quantity+","+price+ ")";
			Integer m = st.executeUpdate(inserInvoice);
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
	public void addInvoice() {
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

			System.out.println("Enter The Invoice Id");
			int id = input.nextInt();
			System.out.println("Enter Invoice date");
			String Invoice_date = input.next();
			System.out.println("write a custmer name?");
			String Cname = input.next();
			
			
			
			String inserInvoice = "insert into invoices (id,invoice_date,customer_name) values(" + id + ",'"+Invoice_date+"','"+Cname+"')";
			Integer m = st.executeUpdate(inserInvoice);
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
	
	public void deletItem() {
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
			String deletItem = "\r\n"
					+ "DELETE FROM [dbo].[shop_items]\r\n"
					+ "      WHERE id="+id;
			Integer m = st.executeUpdate(deletItem);
            if (m >= 1) {
            	System.out.println("Deleted successfully !! ");
} else {
System.out.println("Deleted failed");
			
}	
			
			
			
			// -----------------------------------------------------------//

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	public void updateItem() {
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
			System.out.println("Enter The New price");
			int newprice = input.nextInt();
			String updateItem ="UPDATE [dbo].[shop_items]\r\n" + " SET[price] = " + newprice + " WHERE Id = "
					+ id;
			Integer m = st.executeUpdate(updateItem);
            if (m >= 1) {
            	System.out.println("Update successfully !! ");
} else {
System.out.println("Update failed");
			
}	
			
			
			
			// -----------------------------------------------------------//

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	public void printItem() {
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
			
	String Allitem = "select * from shop_items";
	ResultSet resultSet = st.executeQuery(Allitem);
    while (resultSet.next()) {
    	System.out.println("Print all from shop");
    	System.out.println(resultSet.getString("id"));
    	System.out.println(resultSet.getString("name"));
    	System.out.println(resultSet.getString("description"));
    	System.out.println(resultSet.getString("price"));
}
			
			
			// -----------------------------------------------------------//

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	public void printshop() {
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
			
	String Allitem = "select * from shop_settings";
	ResultSet resultSet = st.executeQuery(Allitem);
    while (resultSet.next()) {
    	System.out.println("Print all from shop");
    	System.out.println(resultSet.getString("id"));
    	System.out.println(resultSet.getString("shop_name"));
    
}
			
			
			// -----------------------------------------------------------//

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	public void printinvoices() {
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
			
	String Allitem = "select * from invoices";
	ResultSet resultSet = st.executeQuery(Allitem);
    while (resultSet.next()) {
    	System.out.println("Print all from invoices");
    	System.out.println(resultSet.getString("id"));
    	System.out.println(resultSet.getString("invoice_date"));
    	System.out.println(resultSet.getString("customer_name"));
        
    
}
			
			
			// -----------------------------------------------------------//

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	public void seachinvoices() {
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
			System.out.println("Enter The invoices Id you want to seach");
			int id = input.nextInt();
			String Allitem = "select * from invoices where id="+id;
			ResultSet resultSet = st.executeQuery(Allitem);
		    while (resultSet.next()) {
		    	System.out.println("Print all from invoices");
		    	System.out.println(resultSet.getString("id"));
		    	System.out.println(resultSet.getString("invoice_date"));
		    	System.out.println(resultSet.getString("customer_name"));
		        
		    
		}
			
			// -----------------------------------------------------------//

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
