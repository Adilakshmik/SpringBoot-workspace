package in.ashokit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmpEntity {
	
	@Id
	private Integer empId;
	private String empName;
	private double empSalary;
	
	public EmpEntity() {
		
	}
	
	public EmpEntity(int empId,String empName,double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmpEntity [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	
	
	
	
	
}
