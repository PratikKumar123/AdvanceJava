package Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedSt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root","root");
			
			PreparedStatement s=c.prepareStatement("insert into form values(?,?,?)");  
			
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
