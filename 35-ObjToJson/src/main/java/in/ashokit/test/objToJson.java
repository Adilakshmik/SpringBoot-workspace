package in.ashokit.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class objToJson {

	public static void main(String[] args) throws IOException {
		//java obj to json
		ObjectMapper mapper=new ObjectMapper();
		ArrayList list=new ArrayList();
		Employee e1=new Employee(1,"vani");
		list.add(e1);
		Employee e2=new Employee(2,"rani");
		list.add(e2);
		Employee e3=new Employee(3,"nani");
		list.add(e3);
		mapper.writeValue(new File("E:\\data\\data.json"), list);
		
		//json to java obj
		ObjectMapper mapper1=new ObjectMapper();
		ArrayList value = mapper1.readValue( new File("E:\\data\\data.json"),ArrayList.class);
		value.forEach(emp->System.out.println(emp));
		
	}

}

class Employee{
	Integer eid;
	String ename;
	public Employee() {
		
	}
	
	
	public Employee(Integer eid, String ename) {
		
		this.eid = eid;
		this.ename = ename;
	}
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
	
	
}
