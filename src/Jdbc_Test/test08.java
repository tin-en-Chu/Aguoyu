package Jdbc_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test08 {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/JDBCSample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "24708053";
	public static final String SQL = "insert into department values(100,'100','100')";

	public static void main(String[] args) {
		Connection con = null;
		Statement pstmt = null;
		int in = 0;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.createStatement();
			

			in = pstmt.executeUpdate(SQL);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException sq) {
			sq.printStackTrace();
		}

	}

}
