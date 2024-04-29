package in.ashokit.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.AddrEntity;
import in.ashokit.entity.EmpEntity;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private AddrRepo addrRepo;
	
	@Autowired
	private EmpRepo empRepo;
	
	public void getEmpAddress() {
		
	AddrEntity entity=new AddrEntity();
	entity.setCity("Pune");
	entity.setState("MH");
	entity.setCountry("India");
	//AddrEntity save = addrRepo.save(entity);
	 AddrEntity addr = addrRepo.getAddr();
	

	EmpEntity entity2=new EmpEntity();
	entity2.setEname("Sravani");
	entity2.setSalary(20000.00);
	entity2.setAddress(addr);
	empRepo.getEmps();
	}
}