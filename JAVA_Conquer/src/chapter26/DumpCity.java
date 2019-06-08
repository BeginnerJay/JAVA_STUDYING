package chapter26;

import java.sql.*;

public class DumpCity {
	public static void main(String[] args) {
		try {
			// 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			// 연결
			Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/Study", "root", "ghlrPtk");
			// 명령 실행
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM City");
			// 결과셋 읽음
			while (rs.next()) {
				String name = rs.getString("name");
				int popu = rs.getInt("popu");
				int area = rs.getInt("area");
				System.out.printf("%s :%4d만명, %4dkm\n", name, popu, area);
			}
			// 정리
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
