package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
	
	@GetMapping("/greet")
	public String getUser(Model model ) {
		model.addAttribute("msg", "Good Morning..");
		return  "view";
	}
	
	@GetMapping("/welcome")
	public String getWelcome(Model model ) {
	int a=10/0;
		model.addAttribute("msg1", "Welcome To Ashok IT..");
		return  "view";
	}
	
	
	//Controller based ExceptionHandling(class based)
	@ExceptionHandler(value = ArithmeticException.class)
	public String handleAe(Model model) {
		model.addAttribute("msg", "Something Went Wrong,Plz try again");
		return "eh";
	}

}
