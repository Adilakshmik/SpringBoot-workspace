package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.Customer;
import in.ashokit.repo.CustomerRepo;
import in.ashokit.utils.EmailUtils;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private EmailUtils emailUtil;
	
	
	public boolean saveRegisteredCustomer(Customer cobj) {
		Customer customer = repo.save(cobj);
		String cemail = customer.getCemail();
		
		String subject="Your Account Created - AshokIT";
		String body="<h1>Welcome To The Dashboard</h1>";
		if(customer.getCid()!=null) {
			boolean sendEmail = emailUtil.sendEmail(cemail, subject, body);
			
		}
		return true;
		}
	
	
	
	public Customer getRegisteredCustomer(Customer cobj) {
		return repo.findByCemailAndCpwd(cobj.getCemail(), cobj.getCpwd());
	}



	public Customer saveRegisteredCustomer1(String cemail,String newPwd) {
		Customer c=new Customer();
		c.setCemail(cemail);
		c.setCpwd(newPwd);
		repo.updateCustomerPassword(cemail, newPwd);
		return c;
	}
	
	
	
//	public String sendConfirmation(Customer customer) {
//		String email = customer.getCemail();
//		email.
//		return "customer";
//	}

}
