package Task1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	public void alldata() throws SQLException {
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		try {

			ResultSet r = stmt.executeQuery("Select id,studName,Address,Designation from studdetails");
			
			while(r.next())  
				System.out.println(r.getInt(1)+" "+r.getString(2)+"  "+r.getString(3)+" "+r.getString(4));  
				con.close(); 

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
