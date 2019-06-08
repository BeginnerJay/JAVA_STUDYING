package chapter26;

import java.sql.*;

public class UpdateTable {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/Study", "root", "ghlrPtk");
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("UPDATE Staff SET salary=250 WHERE name='김유신';");
			stmt.executeUpdate("DELETE FROM Staff WHERE depart='영업부';");
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
