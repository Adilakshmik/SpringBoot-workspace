package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.bindings.Customer;
import in.ashokit.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
	@GetMapping("/login")
	public String loadLoginForm(Model model) {
		model.addAttribute("cobj", new Customer());
		return "loginView";
	}
	
	@PostMapping("/login")
	public String saveLoginedCustomer(Model model,Customer cobj) {
		Customer customer = service.getRegisteredCustomer(cobj);
		if(customer!=null) {
			model.addAttribute("msg",customer.getCname()+", "+"Welcome to Ashok IT..." );
			return "dashboard";
		}else {
			model.addAttribute("cobj", new Customer());
			model.addAttribute("emsg","Invalid Credentials" );
			return "loginView";
		}
	}
	
	@GetMapping("/register")
	public String loadRegisterForm(Model model) {
		model.addAttribute("cobj", new Customer());
		return "registerView";
	}
	
	@PostMapping("/register")
	public String saveRegisteredCustomer(Model model,Customer cobj) {
		service.saveRegisteredCustomer(cobj);
		Model attribute = model.addAttribute("cobj", new Customer());
		model.addAttribute("msg","Registered Successfully");
		return "registerView";
	}
	
	@GetMapping("/logout")
	public String dashboard(Model model) {
		model.addAttribute("cobj", new Customer());
		return "loginView ";
	}
	
	//set password
	
	@GetMapping("/password")
	public String setPassword(Model model,Customer cobj) {
		
		 Customer loggedCustomer = service.getRegisteredCustomer(cobj);
		 if(loggedCustomer!=null) {
		 loggedCustomer.getCemail();
		 String newPwd = loggedCustomer.getCpwd();
		 model.addAttribute("loggedCustomer", new Customer());
		 }
		return "forgotpassword";
	}
	
	@PostMapping("/password")
	public String changePassword(Model model,Customer cobj) {
		 
		Customer loggedCustomer = service.getRegisteredCustomer(cobj);
		 String newPwd = loggedCustomer.getCpwd();
		 String cemail = loggedCustomer.getCemail();
		 Customer saveRegisteredCustomer1 = service.saveRegisteredCustomer1( cemail,newPwd);
		 model.addAttribute("cobj", new Customer());
		 model.addAttribute("newPwd",  saveRegisteredCustomer1);
		return "forgotpassword";
	}
	
}
