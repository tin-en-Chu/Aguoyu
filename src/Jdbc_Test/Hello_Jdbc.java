package Jdbc_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Hello_Jdbc {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "24708053";

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的名稱");
		String dname = sc.next();
		System.out.println("要新增的所在地");
		String loc = sc.next();
		sc.close();		
				
		try {
			// 1.載入驅動
			Class.forName(DRIVER);
			System.out.println("載入成功");
			// 2.連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");

			// 3.送出SQL指令
			
			pstmt=con.prepareStatement("insert into department values(?,?,?)");
			pstmt.setInt(1,deptno);
			pstmt.setString(2,dname);
			pstmt.setString(3,loc);
			
			pstmt.executeUpdate();
			
			
			
			
//			stmt = con.createStatement();
//			int count = stmt.executeUpdate("delete from department where deptno=2");
//			System.out.println(count);
//			rs= stmt.executeQuery("select *from department ");
//				while(rs.next()) {
//					int deptno=rs.getInt("deptno");
//					String dname=rs.getString("dname");
//					String loc =rs.getNString("loc");
//					
//					System.out.println("deptno="+deptno);
//					System.out.println("dname="+dname);
//					System.out.println("loc="+loc);
//					System.out.println("============================");
//				}
//			ResultSet x = executeQuery(Select*from department);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

		} finally {
			if (rs != null) { // 假使在載入驅動就炸開就部會跑到IF裡面，因為CON還是NULL
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (pstmt != null) { // 假使在載入驅動就炸開就部會跑到IF裡面，因為CON還是NULL
				try {
					pstmt.close();
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
}