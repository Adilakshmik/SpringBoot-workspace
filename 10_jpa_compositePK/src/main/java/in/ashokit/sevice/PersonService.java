package in.ashokit.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.PersonEntity;
import in.ashokit.entity.PersonPks;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo repo;
	
	public void savePerson() {
		
		PersonPks pks=new PersonPks();
		pks.setPid(102);
		pks.setPassport("WUEYEUW12U");
		
		PersonEntity entity =new PersonEntity();
		entity.setName("manu");
		entity.setGender("Female");
		entity.setEmail("manu@gmail.com");
		entity.setPks(pks);
		
		PersonEntity save = repo.save(entity);
		System.out.println("Person Saved");
		
	}
}
