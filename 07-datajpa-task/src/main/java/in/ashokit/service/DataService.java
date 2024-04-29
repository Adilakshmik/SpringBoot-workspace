package in.ashokit.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.PersonalData;
import in.ashokit.repo.Repo;

@Service
public class DataService {
	private Repo repo;
	
	public DataService (Repo repo) {
		this.repo=repo;
	}
	
	public void saveDetails(){
	
	LocalDate dob=LocalDate.of(2001, 12, 24);
	String profilePath = "\"C:\\Users\\adila\\OneDrive\\Pictures\\PHOTO.jpg\"";
	String resumePath ="\"C:\\Users\\adila\\OneDrive\\Documents\\Koniki Adilakshmi .pdf\"";
	
	PersonalData entity=new PersonalData();
	entity.setId(102);
	entity.setName("harish");
	entity.setGender('M');
	entity.setDob(dob);
	entity.setProfile(profilePath);
	entity.setResume(resumePath);
	
	
	LocalDate dob1=LocalDate.of(2002, 02, 03);
	String profilePath1 = "\"C:\\Users\\adila\\OneDrive\\Pictures\\PHOTO.jpg\"";
	String resumePath1 ="\"C:\\Users\\adila\\OneDrive\\Documents\\Koniki Adilakshmi .pdf\"";
	
	PersonalData entity1=new PersonalData();
	entity1.setId(103);
	entity1.setName("Lakshmi");
	entity1.setGender('F');
	entity1.setDob(dob1);
	entity1.setProfile(profilePath1);
	entity1.setResume(resumePath1);
	
	
	repo.saveAll(List.of(entity,entity1));
	System.out.println("resord saved");
	}
	
	
	public void getDetails() {
		Iterable<PersonalData> details = repo.findAll();
		details.forEach(info->System.out.println(info));
	}
}
