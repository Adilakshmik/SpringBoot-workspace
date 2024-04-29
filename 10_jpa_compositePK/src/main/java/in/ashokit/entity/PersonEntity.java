package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class PersonEntity {
	private String name;
	private String email;
	private String gender;
	
	@EmbeddedId
	private PersonPks pks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PersonPks getPks() {
		return pks;
	}

	public void setPks(PersonPks pks) {
		this.pks = pks;
	}

	@Override
	public String toString() {
		return "PersonEntity [name=" + name + ", email=" + email + ", gender=" + gender + ", pks=" + pks + "]";
	}
	
	
	
}
