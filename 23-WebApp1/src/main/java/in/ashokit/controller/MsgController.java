package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getMsg1() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg1", " hyderabad");
		mav.setViewName("index");
			
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getMsg2() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg2", 6789);
		mav.setViewName("index1");
		
		return mav;
	}
}
