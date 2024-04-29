package in.ashokit.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ProductNotFoundException extends Exception{
	
	public ProductNotFoundException() {
		
	}
	
	public ProductNotFoundException(String msg) {
		super(msg);
	}
}
