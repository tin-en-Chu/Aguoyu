package ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOimpl implements DeptDAO {
	public static final String INSERT_STMT = "insert into department values (?, ?, ?)";
	public static final String FIND_BY_DEPTNO = "select*from department where deptno=?";
	public static final String GET_ALL="select*from department order by deptno";
	public static final String DELETE_A="delete from department where deptno=?";
	public static final String UPDATE_A="update department set dname=? where deptno=?";
	// static區塊
	//當此類別被JVM載入時, 驅動也就跟著載入到執行環境裡 (一次性)
	static {
		try {
			Class.forName(UTIL.DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void save(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(UTIL.URL, UTIL.USER, UTIL.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			pstmt.setInt(1, dept.getDeptno());     
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UTIL.closeResources(con, pstmt, null);
		}

	}

	@Override
	public void update(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt=null;
		
		try {
			con=DriverManager.getConnection(UTIL.URL,UTIL.USER,UTIL.PASSWORD);
			pstmt=con.prepareStatement(UPDATE_A);
			pstmt.setString(1,dept.getDname());
			pstmt.setInt(2,dept.getDeptno());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			UTIL.closeResources(con, pstmt, null);
		}
	}

	@Override
	public void delete(Integer d) {
		Connection con=null;
		PreparedStatement pstmt =null;
		
		try {
			con=DriverManager.getConnection(UTIL.URL,UTIL.USER,UTIL.PASSWORD);
			pstmt=con.prepareStatement(DELETE_A);
			pstmt.setInt(1,d);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			UTIL.closeResources(con, pstmt, null);
		}
	}

	@Override
	public Dept findByDeptno(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept dept = null;
		try {
			con = DriverManager.getConnection(UTIL.URL, UTIL.USER, UTIL.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);
			pstmt.setInt(1, deptno);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 用Dept Bean包裝查詢出來的部門資料做回傳

//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				dept = new Dept();
				dept.setDeptno(deptno);
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UTIL.closeResources(con, pstmt, rs);
		}

		return dept;
	}

	
	
	
	
	
	
	@Override
	public List<Dept> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList=new ArrayList<Dept>();//new一個list
		try {
			con = DriverManager.getConnection(UTIL.URL, UTIL.USER, UTIL.PASSWORD);//建立連線
			pstmt = con.prepareStatement(GET_ALL);//準備prepareStatement並塞入sql指令
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 用Dept Bean包裝查詢出來的部門資料做回傳
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				//用集合收集著包裝好的查詢結果(部門物件)
				deptList.add(dept);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UTIL.closeResources(con, pstmt, rs);
		}

		return deptList;
	}

}
