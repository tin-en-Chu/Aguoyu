package ORM;

import java.util.List;
import java.util.Scanner;

public class DeptTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("要更換的column:");
		String dname=sc.next();
		System.out.println("要新增(查詢、刪除、更改)的編號");
		int deptno = sc.nextInt();
//		System.out.println("要新增的名稱");
//		String dname = sc.next();
//		System.out.println("要新增的所在地");
//		String loc = sc.next();
//		sc.close();
		

//		DeptDAO dd=new DeptDAOimpl();
//		dd.delete(deptno);
//		
		
		//更改
		Dept dept =new Dept(deptno,dname,null);
		DeptDAO dd= new DeptDAOimpl();
		dd.update(dept);
		
		
		
		
		
////		用Dept bean包裝要新增的資料
//		Dept dept= new Dept(deptno,dname,loc);
////		透過DAO物件呼叫方法完成新增部門資料
//		DeptDAO DAO= new DeptDAOimpl();
//		DAO.save(dept);
//		System.out.println("新增完成");
		
		
		
		//透過DAO物件呼叫方法完成查詢部門資料
//		DeptDAO DAO= new DeptDAOimpl();
//		Dept dept=DAO.findByDeptno(deptno);
//		System.out.println(dept);
		
		
		
		
		
//		DeptDAO dao=new DeptDAOimpl();
//		List<Dept> deptList=dao.getAll();
//		for(Dept dept:deptList) {
//			System.out.println(dept);
//		}
		
		
		
		
	}
}
