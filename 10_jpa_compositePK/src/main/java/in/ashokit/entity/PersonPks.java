package in.ashokit.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPks {
	private Integer pid;
	private String passport;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "PersionPks [pid=" + pid + ", passport=" + passport + "]";
	}
	
	
}
