package in.ashokit.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class EmpEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String ename;
	private Double salary;
	
	//@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="aid")
	private AddrEntity address;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public AddrEntity getAddress() {
		return address;
	}

	public void setAddress(AddrEntity addr) {
		this.address = addr;
	}

	@Override
	public String toString() {
		return "EmpEntity [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "]";
	}

	

	
}
