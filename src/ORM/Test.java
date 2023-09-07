package ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	private static final String SQL="select *from employee where empno=7001";
				
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs= null;
		try {
			Class.forName(UTIL.DRIVER);
			con = DriverManager.getConnection(UTIL.URL, UTIL.USER, UTIL.PASSWORD);
			stmt=con.createStatement();
			rs=stmt.executeQuery(SQL);
			while(rs.next()) {
				rs.getString("empno");
				System.out.println("你好"+rs.getString("empno"));
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
