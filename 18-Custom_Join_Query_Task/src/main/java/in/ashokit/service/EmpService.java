package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Emp;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private AddrRepo addrRepo;
	
	public void saveEmp() {
		Emp emp=new Emp();
		emp.setEname("honey");
		emp.setSalary(30000.00);
		
		Address addr=new Address();
		addr.setCity("ONG");
		addr.setState("AP");
		addr.setCountry("India");
		
		emp.setAddress(addr);
		addr.setEmployee(emp);
		
		empRepo.save(emp);
		addrRepo.save(addr);
		}
	
	public void getEmp() {
		List<Emp> list1 = empRepo.findAll();
		list1.forEach(emp->System.out.println(emp.getEname()));
		
		List<Address> list2 = addrRepo.findAll();
		list2.forEach(addr->System.out.println(addr.getAid()));
	}
	
}
