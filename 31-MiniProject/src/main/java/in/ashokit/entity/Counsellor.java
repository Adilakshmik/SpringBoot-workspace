package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="counsellor_details")
public class Counsellor {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer cid;
	private String cname;
	private String cemail;
	private String cpwd;
	private Integer cphno;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public Integer getCphno() {
		return cphno;
	}
	public void setCphno(Integer cphno) {
		this.cphno = cphno;
	}
	
	
	
}
