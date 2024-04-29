package in.ashokit.user;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp {
	
	@Id
	
    @GeneratedValue(generator = "ait_generator")
    @org.hibernate.annotations.GenericGenerator(
            name = "ait_generator",
            strategy = "in.ashokit.generator.EmpGenerator"
    )
	private String eid;
	
	private String ename;
	private Double eamount;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEamount() {
		return eamount;
	}
	public void setEamount(Double eamount) {
		this.eamount = eamount;
	}
	
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", eamount=" + eamount + "]";
	}
	

}
