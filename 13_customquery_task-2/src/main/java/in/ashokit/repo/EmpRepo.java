package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.EmpEntity;

public interface EmpRepo extends JpaRepository<EmpEntity,Integer>{
	
	//Develop data jpa application to retrieve only emp_name and emp_salary details from employee_tbl	using custom query.
	
	@Query("select e.empName,e.empSalary from EmpEntity e")
	public List<Object[]> findEmpNameAndSalary();
}
