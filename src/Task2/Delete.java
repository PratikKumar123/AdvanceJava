package Task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public void delete() throws SQLException {
		
		Connection c = Connection1.getCon();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("These are the data we have which row you want to delete:");
		PreparedStatement p = c.prepareStatement("select id,name,location,designation from crud_op");
		
		ResultSet r = p.executeQuery();
		while(r.next()) {
			System.out.println(r.getInt(1)+" "+ r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
		}

		System.out.println("Enter the  id  which you want to delete:");
		int i = sc.nextInt();


		PreparedStatement p1 = c.prepareStatement("delete from crud_op where id=?");

		p1.setInt(1, i);
		p1.executeUpdate();
		
	}
}
