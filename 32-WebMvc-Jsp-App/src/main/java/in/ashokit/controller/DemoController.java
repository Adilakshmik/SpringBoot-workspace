package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/welcome")
	public String welcomeMsg(Model model) {
		model.addAttribute("message", "Welcome TO Ashok IT");
		return "index";
	}
}
