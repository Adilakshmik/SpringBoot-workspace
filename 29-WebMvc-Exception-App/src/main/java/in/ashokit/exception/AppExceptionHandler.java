package in.ashokit.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.ashokit.controller.ProductNotFoundException;

@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Model model) {
		
		return "eh";
		
	}
		@ExceptionHandler(value=ProductNotFoundException.class)
		public String ProductexceptionHandler(Model model) {
			model.addAttribute("msg", "Invalid Product id");
			return "eh";
		}
	}

