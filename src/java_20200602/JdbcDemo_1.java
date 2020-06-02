package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo_1 {
	public static void main(String[] args) {
		
		//1. 드라이브 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("드라이버 로드 실패");
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/kpc",
				"kpc12",
				"kpc1234"
					);
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES (?,?,?)");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 10);
			pstmt.setString(2, "랄프");
			pstmt.setString(3, "미국");
			
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : "+resultCount);
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (con != null) con.close();
				if (pstmt != null) con.close();	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
			
		
	}
}
