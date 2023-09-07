package Jdbc_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class trst {
	public static void main(String[] args) {
		final String SQL = "select*from employee";
		Connection con = null;
		try {
			Class.forName(util.Driver);// 輸入驅動
			con = DriverManager.getConnection(util.URL, util.USER, util.PASSWORD);// 建立連線
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				String empno = rs.getString("empno");

				System.out.println(empno);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException sq) {
			sq.printStackTrace();
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
