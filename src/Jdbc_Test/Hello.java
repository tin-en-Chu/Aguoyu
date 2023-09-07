package Jdbc_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hello {
	public static final String Driver = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "24708053";
	public static final String SQL = "insert into department value(?,?,?)  ";

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ppstmt=null;
		int sr=0;

		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			ppstmt=con.prepareStatement(SQL);
			con.setAutoCommit(false);
			ppstmt.setInt(1,10);
			
			con.setSavepoint();
			
			ppstmt.setInt(2,10);
			ppstmt.setInt(3,10);
			
			
			
			sr=ppstmt.executeUpdate(SQL);
			
			System.out.println("更新成功!更新欄位:"+sr+"格");
			
			
			
		
			
	
			
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
