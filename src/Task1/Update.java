package Task1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public void update() throws SQLException {
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		try {

			int check = stmt.executeUpdate("update studdetails set studName = 'Pratik Kumar Bhatt' where studName ='Suman' ");

			if (check == 0) {
				System.out.println("Not Updated");
			} else {
				System.out.println("Data Updated successfully :");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
