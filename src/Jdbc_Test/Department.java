package Jdbc_Test;

import java.io.Serializable;

public class Department implements Serializable {//ORM   JAVA BEAN第三要素:實作serializable介面(貼標籤)
	private Integer deptno;
	private String dname;
	private String loc;
	
	public Department() {//ORM   JAVA BEAN第一要素:不帶參數的空建構子
		super();
	}
	public Department(Integer deptno,String dname,String loc) {
		this.deptno=deptno;
		this.dname=dname;
		this.loc=loc;
	}
	public Integer getDeptno() {	////ORM   JAVA BEAN第二要素:GETTER SETTER
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
