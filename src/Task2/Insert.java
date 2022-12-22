package Task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
	public void insert() throws SQLException {

		Connection c = Connection1.getCon();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id :");
		int i = sc.nextInt();

		System.out.println("Enter your name :");
		String s1 = sc.next();

		System.out.println("Enter your location :");
		String s2 = sc.next();
		
		System.out.println("Enter your designation :");
		String s3 = sc.next();

		PreparedStatement p = c.prepareStatement("insert into crud_op(id,name,location,designation) values(?,?,?,?)");

		p.setInt(1, i);
		p.setString(2, s1);
		p.setString(3, s2);
		p.setString(4, s3);

		int i1 = p.executeUpdate();
		System.out.println(i1);
	}
}
