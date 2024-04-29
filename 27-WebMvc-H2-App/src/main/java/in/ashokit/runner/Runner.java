package in.ashokit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Customer;
import in.ashokit.repo.CustomerRepo;

@Component
public class Runner implements ApplicationRunner{
	
	@Autowired 
	private CustomerRepo repo;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Customer c1=new Customer();
		c1.setCname("padma");
		c1.setPhno(834382937);
		
		Customer c2=new Customer();
		c2.setCname("Roja");
		c2.setPhno(263726732);
		repo.save(c1);
		repo.save(c2);
		
		
			List<Customer> all = repo.findAll();
			all.forEach(System.out::println);
		
		}
	
	

}
