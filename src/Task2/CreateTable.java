package Task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CreateTable {

	public void create() throws SQLException {
		Connection c= Connection1.getCon();
		PreparedStatement p1 = c.prepareStatement("create table crud_op (id int, name VARCHAR(30), location VARCHAR(130) , designation VARCHAR(130) );");
		p1.executeUpdate();
		
		
	}
}
