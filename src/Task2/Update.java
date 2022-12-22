package Task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	
	public void update() throws SQLException {
		
		Connection c = Connection1.getCon();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("These are the data we have which row you want to update:");
		PreparedStatement p = c.prepareStatement("select id,name,location,designation from crud_op");
		
		ResultSet r = p.executeQuery();
		while(r.next()) {
			System.out.println(r.getInt(1)+" "+ r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
		}
		System.out.println("Enter id no to change particular name  :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter new name :");
		String s1 = sc.next();

		PreparedStatement p1 = c.prepareStatement("update crud_op set name=? where id=?");

		p1.setString(1, s1);
		p1.setInt(2, n1);

		int i1 = p1.executeUpdate();
		System.out.println(i1);
		
	}

}
