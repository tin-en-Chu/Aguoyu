package ORM;

import java.util.List;

public interface DeptDAO {
	void save(Dept dept);
	void update(Dept dept);		
	void delete(Integer d);
	
	
	Dept findByDeptno(Integer deptno);//單筆查詢
	List<Dept> getAll(); //多筆資料查詢
}
