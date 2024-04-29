package in.ashokit;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<EmpEntity, Integer>{
	//select * from emp_entity where empName=:empName,:represents dynamic value
	//public List<EmpEntity> findByEmpName(String name);
	
	//select * from emp_entity where empNameStartsWith=:%a
	//public List<EmpEntity> findByEmpNameStartsWith(char c);
	
	//select * from emp_entity where empId=:empId
	//public List<EmpEntity> findByEmpSalary(double salary);
	
	//select * from emp_entity where empSalary<=:empSalary
	//public List<EmpEntity> findByEmpSalaryLessThanEqual(double salary);
	
	//select * from emp_entity(sample)
	//using HQL
	
	@Query("select e.empName,e.empSalary from  EmpEntity e")
	public List<Object[]> getAllEmpHql();
	
	//using SQL
//	@Query(value="select * from emp_entity", nativeQuery=true)
//	public List<EmpEntity> getAllEmpSql();
	
	//select * from emp_entity where emp_id=:emp_id
	//using HQL
//	@Query("from EmpEntity where empId=:id")
//	public EmpEntity  getEmpByIdHql(int id);
	
	//using SQL
	@Query(value="select * from emp_entity where emp_id=103", nativeQuery=true)
	public EmpEntity getEmpByIdSql();
	

	

}
