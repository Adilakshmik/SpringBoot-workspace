package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.AddrEntity;
import in.ashokit.entity.EmpEntity;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmpRepo;
import jakarta.transaction.Transactional;

@Service
public class EmpService {
	@Autowired
    private EmpRepo empRepo;
	
	@Autowired
    private AddrRepo addrRepo;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveEmp() {
		EmpEntity entity1=new EmpEntity();
		entity1.setEname("Ram");
		entity1.setEsalary(50000.00);
		EmpEntity save = empRepo.save(entity1);
		Integer eid = save.getEid();
		empRepo.save(entity1);
		
		int res=10/0;
		
		AddrEntity entity2=new AddrEntity();
		entity2.setArea("Vizag");
		entity2.setState("AP");
		entity2.setCountry("India");
		entity2.setEid(eid);
		addrRepo.save(entity2);
		
		
	

		
	}
    }
