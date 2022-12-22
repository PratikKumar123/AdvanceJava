package Task2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {
	
	private static Connection con;

	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "root");
			
		} 
		catch (Exception e) {
			System.out.println("Driver not found.");
		}
		return con;
	}
}