package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
	
	
	// creating user defined Exception 
	@GetMapping("/product/{pid}")
		public String getProduct(@PathVariable("pid") Integer pid,Model model) throws Exception{
		if(pid>=100) {
			throw new ProductNotFoundException("Invalid Product id");
			
		}else {
			model.addAttribute("msg", "Product Name - Apple");
			
		}
		return "eh";
		}
	
	
}
