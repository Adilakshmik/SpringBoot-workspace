package in.ashokit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	private  EmpRepo empRepo;
	
	public EmpService(EmpRepo empRepo) {
		this.empRepo=empRepo;
	}
	
	
	public void saveEmployee() {
	
		EmpEntity entity1=new EmpEntity();
		entity1.setEmpId(101);
		entity1.setEmpName("harish");
		entity1.setEmpSalary(1500);
		empRepo.save(entity1);
		System.out.println("entity1 saved");
	}
	
		public void saveAllEmployee() {
	EmpEntity entity1=new EmpEntity();
	entity1.setEmpId(102);
	entity1.setEmpName("honey");
	entity1.setEmpSalary(5000);
	EmpEntity entity2=new EmpEntity();
	entity2.setEmpId(103);
	entity2.setEmpName("Mani");
	entity2.setEmpSalary(1000);
	System.out.println(empRepo.getClass().getName());
	empRepo.saveAll(List.of(entity1,entity2));
	System.out.println("entities saved");
		}
			
//			public void countEmployees() {
//		System.out.println("total no.of rows are:"+empRepo.count());
// }
			
//			public void deleteEmployee() {			
//		empRepo.delete(entity2);
//		System.out.println("entity2 deleted" );
// }
			
//	public void deleteEmployee() {
//	empRepo.deleteById(104);
//	System.out.println(" deleted" );
//	}
	
//  public void deleteAllEmployeeByEntity() {
//	empRepo.deleteAll(List.of(entity1));
//	System.out.println(" deleted" );
// }
			
//	public void getEmps(int id) {
//	List<Integer> list = Arrays.asList(101,102);	
//	Iterable<EmpEntity> emps= empRepo.findAllById(list);
		
//Iterable<EmpEntity> emps= empRepo.findAllById(List.of(id,id1));
	
//		ArrayList al=new ArrayList();
//		al.add(109);
//	Iterable<EmpEntity> emps= empRepo.findAllById(al);
//	emps.forEach(e->System.out.println(e));
//	}
	
//	public void check() {
//	System.out.println(empRepo.existsById(101));
//	}
		
//	public void getEmp() {
//		Optional<EmpEntity> emp = empRepo.findById(102);
//		if(emp.isPresent()){
//			EmpEntity empEntity = emp.get();
//			System.out.println(empEntity);
//		}else {
//			System.out.println("not available");
//			}
		

//	}

//	public void getAllEmps() {
//		Iterable<EmpEntity> all = empRepo.findAll();
//		all.forEach(e->System.out.println(e));
//		
//	}
	
//	public void getByName() {
//
//		List<EmpEntity> byEmpName = empRepo.findByEmpName("smith");
//		byEmpName.forEach(name->System.out.println(name));
//	}
	
//	public void getByNameStartsWith() {
//		List<EmpEntity> byEmpNameStartsWith = empRepo.findByEmpNameStartsWith('h');
//		byEmpNameStartsWith .forEach(name->System.out.println(name));
//	}
//	
//	public void getBySalary() {
//		List<EmpEntity> byEmpSalary = empRepo.findByEmpSalary(5000.00);
//		byEmpSalary  .forEach(name->System.out.println(name));
//	}	
	
//	public void getBySalary() {
//		List<EmpEntity> byEmpSalary = empRepo.findByEmpSalaryLessThanEqual(3000.00);
//		byEmpSalary  .forEach(name->System.out.println(name));
//	}
	
	public void getAllEmpByHql() {
		List<Object[]> allEmp = empRepo.getAllEmpHql();
        for (Object[] objArray : allEmp) {
            String empName = (String) objArray[0];
            Double empSalary = (Double) objArray[1];
            System.out.println("Emp Name: " + empName + ", Emp Salary: " + empSalary);
        }
    }
}
		//allEmp.forEach(name->System.out.println(name));
		//allEmp .forEach(emp->System.out.println(emp));
//			EmpEntity record= row[0];
//			//EmpEntity emp_salary=(EmpEntity) row[1];
//		
//		System.out.println("Id"+record.getEmpName());
//		});
		
		
		
	//}
	
//	public void getAllEmpBySql() {
//		List<EmpEntity> allEmp = empRepo.getAllEmpSql();
//		allEmp.forEach(emp->System.out.println(emp));
//		
//	}
	
//	public void getEmpByHql() {
//		EmpEntity Emp = empRepo.getEmpByIdHql(104);
//		System.out.println(Emp);
//		}
	
//	public void getEmpBySql() {
//		EmpEntity Emp = empRepo.getEmpByIdSql();
//		System.out.println(Emp);
//		}
//}

