package in.ashokit.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PersonalData {
	@Id
	private Integer id;
	private String name;
	private Character gender;
	private LocalDate dob;
	private String profile;
	private String resume;
	
	@Override
	public String toString() {
		return "PersonalData [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", profile="
				+ profile + ", resume=" + resume + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob2) {
		this.dob = dob2;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String filePath) {
		this.profile = filePath;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resumePath) {
		this.resume = resumePath;
	}
	
	
}
