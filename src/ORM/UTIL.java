package ORM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UTIL {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "24708053";

	public static void closeResources(Connection con, PreparedStatement stmt, ResultSet rs) {
		if (rs != null) { 
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (stmt != null) { 
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

				if (con != null) { // 假使在載入驅動就炸開就部會跑到IF裡面，因為CON還是NULL
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
