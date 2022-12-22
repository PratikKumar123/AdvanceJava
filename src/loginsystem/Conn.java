package loginsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	private static Connection con;

	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "root");
			
		} 
		catch (Exception e) {
			System.out.println("Driver not found.");
		}
		return con;
	}
}