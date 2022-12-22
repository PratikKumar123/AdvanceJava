package loginsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepared {
	public static void main(String[] args) throws SQLException {
		
		Connection c= Conn.getCon();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter id :");
		int i = sc.nextInt();
		
		System.out.println("Enter your name :");
		String s1 = sc.next();
		
		System.out.println("Enter pass :");
		String s2 = sc.next();
		
		PreparedStatement p = c.prepareStatement("insert into userdetails(id,userName,userPass) values(?,?,?)");
		
		p.setInt(1,i);
		p.setString(2, s1);
		p.setString(3, s2);
		
		
		int i1 = p.executeUpdate();
		System.out.println(i1);
	}

}
