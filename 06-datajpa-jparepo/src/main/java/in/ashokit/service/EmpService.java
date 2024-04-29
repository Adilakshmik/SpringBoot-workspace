package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {
	private EmpRepo empRepo;
	
	public EmpService (EmpRepo repo) {
		this.empRepo=repo;
	}
	
	
//	public void saveEmps() {
//		Employee entity=new Employee();
//		entity.setEid(104);
//		entity.setEname("rani");
//		entity.setEsalary(50000.00);
//		
//		Employee entity1=new Employee();
//		entity1.setEid(105);
//		entity1.setEname("priya");
//		entity1.setEsalary(250000.00);
//		
//		Employee entity2=new Employee();
//		entity2.setEid(107);
//		entity2.setEname("madhu");
//		entity2.setEsalary(29000.00);
//		
//		List<Employee> list = List.of(entity,entity1,entity2);
//		
//		empRepo.saveAll(list);
//		System.out.println("Records saved");
//	}
	
	public List<Employee> getAllEmps() {
		List<Employee> all = empRepo.findAll();
		return all;
	}
	
	//sorting
	public void sortAllEmps() {
		Sort sort=Sort.by("esalary").descending();
		List<Employee> list=empRepo.findAll(sort);
		list.forEach(emp->System.out.println(emp));
		}
	
	public void sortAllEmps1() {
		Sort sort=Sort.by("esalary","eid").descending();
		List<Employee> list=empRepo.findAll(sort);
		list.forEach(emp->System.out.println(emp));
		}
	
	//pagenation
	public void getAllEmpsPagenation() {
		int pageSize=3;
		int pageNo=2; //come from UI
		PageRequest pageRequest = PageRequest.of(pageNo-1, pageSize);
		Page<Employee> page = empRepo.findAll(pageRequest);
		 List<Employee> content = page.getContent();
		content.forEach(info->System.out.println(info));
		}
	//Query by Example
	public void getAllEmpsWithFilter() {
		Employee entity=new Employee();
		entity.setEname("jaanu"); //come from UI
		entity.setEsalary(15000.00);
		Example<Employee> example = Example.of(entity);
		List<Employee> all = empRepo.findAll(example);
		all.forEach(emp->System.out.println(emp));
	}
}
