package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@Value("${msg}")//this annotation for reading value from properties file with the key value
	private String message;
	
	@GetMapping("/")
	@ResponseBody
	public String welcomeMsg() {
		return message;
	}
	
//	@GetMapping("/welcome")
//	@ResponseBody
//	public String welcomeMsg1() {
//		return "welcome";
//	}
	
}
