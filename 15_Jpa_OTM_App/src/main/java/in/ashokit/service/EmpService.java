package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
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
	
	public void saveDetails() {
		Emp e=new Emp();
		e.setEname("Smrithi");
		e.setEsalary(20000.00);
		
		Address a1=new Address();
		a1.setCity("BNG");
		a1.setState("KN");
		a1.setCountry("India");
		a1.setAddrType("present");
		
		Address a2=new Address();
		a2.setCity("GNT");
		a2.setState("AP");
		a2.setCountry("India");
		a2.setAddrType("Permanent");
		
		e.setAddress(List.of(a1,a2));
		
		a1.setEmp(e);
		a2.setEmp(e);
		
		empRepo.save(e);
		}
	
	public void getEmp() {
		Optional<Emp> id = empRepo.findById(1);
		if(id.isPresent()) {
			 Emp emp = id.get();
			 List<Address> address = emp.getAddress();
			 address.forEach(a->System.out.println(a.getAid())); //depends on fetch type
		}
			
		}
		
		public void getAddr() {
			Optional<Address> id1 = addrRepo.findById(1);
			if(id1.isPresent()) {
				 Address addr = id1.get();
				 Emp emp = addr.getEmp();
				System.out.println(emp.getEid());
				 }
	}
		
}
