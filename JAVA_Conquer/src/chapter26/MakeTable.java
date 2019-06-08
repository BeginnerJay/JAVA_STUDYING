package chapter26;

import java.sql.*;

public class MakeTable {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/Study", "root", "ghlrPtk");
			Statement stmt = conn.createStatement();

			// 테이블 재초기화
			stmt.executeUpdate("DROP TABLE IF EXISTS Staff;"); 
			stmt.executeUpdate("CREATE TABLE Staff (" + 
					"name NVARCHAR (30) NOT NULL PRIMARY KEY," + 
					"depart NVARCHAR (10) NOT NULL," + 
					"salary INT NOT NULL," + 
					"achieve INT NULL," + 
					"workMonth INT NULL);");
			// 샘플 레코드 삽입
			stmt.executeUpdate("INSERT INTO Staff VALUES ('김유신','관리부',180,88,12);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('유관순','지원부',190,NULL,28);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('안중근','영업부',185,76,19);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('윤봉길','생산부',200,71,38);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('강감찬','영업부',150,28,3);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('정몽주','관리부',170,88,12);");

			// 결과셋 읽음
			ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
