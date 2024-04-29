package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.EmpEntity;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	
	public void saveAllEmps() {
	EmpEntity entity1=new EmpEntity();
	entity1.setEmpId(1);
	entity1.setEmpName("kalayani");
	entity1.setEmpSalary(10000.00);
	
	EmpEntity entity2=new EmpEntity();
	entity2.setEmpId(2);
	entity2.setEmpName("balaji");
	entity2.setEmpSalary(20000.00);
	
	EmpEntity entity3=new EmpEntity();
	entity3.setEmpId(3);
	entity3.setEmpName("bhavana");
	entity3.setEmpSalary(30000.00);
	
	List<EmpEntity> saveAll = empRepo.saveAll(List.of(entity1,entity2,entity3));
	saveAll.forEach(emp->System.out.println(emp));
}
	public void getAllEmpNameAndSalary() {
		List<Object[]> empNameAndSalary = empRepo.findEmpNameAndSalary();
		for(Object[] objArray:empNameAndSalary) {
			String empName=(String)objArray[0];
			Double empSalary =(Double) objArray[1];
			System.out.println("EmpName:"+empName+",EmpSalary:"+empSalary);
		}
	}
}
