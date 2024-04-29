package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class MsgController {
	
	@GetMapping("/greet")
	public String greetMethod(@RequestParam("name") String name,Model model) {
	model.addAttribute("msg", name+",Good Morning");
		return "index";
	}
	
	@GetMapping("/welcome/names/{name}")
	@ResponseBody
	public String getMessage(@PathVariable("name") String name,Model model) {
		
		return  name+", Welcome To Ashok IT";
	}
}
