package in.ashokit.service;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repo.EmpRepo;
import in.ashokit.user.Emp;

@Service
public class EmpService  {
	
	@Autowired
	private EmpRepo repo;
	
	public void saveUsers() {
		Emp entity=new Emp();
		entity.setEname("ananth");
		entity.setEamount(60000.00);
		Emp save = repo.save(entity);
		String eid = save.getEid();
		System.out.println(eid);
	}

	
	
	
}
