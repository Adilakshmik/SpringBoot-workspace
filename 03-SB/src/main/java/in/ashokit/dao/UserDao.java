package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao::constructor");
		
	}
	
	public String findName(int id) {
		if(id==100) {
			return "john";
		}else {
			return "smith";
		}
	}
	
}
