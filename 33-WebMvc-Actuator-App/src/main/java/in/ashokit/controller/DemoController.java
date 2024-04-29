package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@GetMapping("/")
	@ResponseBody
	public String demo(@RequestParam("name") String name) {
		return "good Morning..!!"+name;
	}
	
	

}
