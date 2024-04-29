package in.ashokit.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
	public void saveDetails() {
		
	Person p=new Person();
	p.setName("Hema");
	p.setGender("Female");
	
	Passport pp=new Passport ();
	pp.setPassportNo("jdhjs7287");
	pp.setIssueDate(LocalDate.now());
	pp.setExpiryDate(LocalDate.now().plusYears(10));
	
	
	p.setPassPort(pp);
	pp.setPerson(p);
	
	//personRepo.save(p);
	passportRepo.save(pp);
	System.out.println("saved successfully");
	}
	
	public void getDetails() {
		//Optional<Passport> byId = passportRepo.findById(2);
		Optional<Person> id = personRepo.findById(3);
//		if(id.isPresent()) {
//			
//			personRepo.findAll()
//			          .forEach(person->System.out.println(person));
//		}
	}
}
