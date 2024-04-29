package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	 
	@GetMapping("/wish")
	public String getCustomer(Model model) {
		String s=null;
		s.length();
		model.addAttribute("msg2", "Congratulations..!");
		return "view";
	}
}
