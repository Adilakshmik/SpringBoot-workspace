package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repo.UserRepo;
import in.ashokit.user.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public void saveUsers() {
		User entity=new User();
		entity.setUname("Harish");
		entity.setUamount(1600.00);
		
		repo.save(entity);
	}

}
