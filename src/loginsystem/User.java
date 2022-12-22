package loginsystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class User {

	public void getData() throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		try {
		Connection con = Conn.getCon();
		
		Statement s=con.createStatement();
		
		ResultSet rs=s.executeQuery("select userName,userPass from userdetails"); 
		String s1 = null;
		String s2 = null;
		
		if(rs.next()){
			   s1 = rs.getString(1);
			   s2 = rs.getString(2);
		}
		System.out.println("Enter username: ");
        String uName=sc.next();
        
        System.out.println("Enter pass: ");
        String Upass=sc.next();

        
		if(uName.equals(s1) && Upass.equals(s2)) {
			System.out.println("Login succcessfull");
			
		}else {
			System.out.println("Enter valid credentials");
		}

		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
