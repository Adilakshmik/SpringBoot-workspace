package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.bindings.Product;
import in.ashokit.service.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	private ProductServiceImpl service;
	
	@GetMapping("/")
	public ModelAndView loadForm() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("pobj", new Product());
		mav.setViewName("index");
		return mav;
	}
	
	@PostMapping("/product")
	public ModelAndView saveProduct(  Product pobj) {
		
		ModelAndView mav=new ModelAndView();
		
		boolean status = service.saveProduct(pobj);
		if(status) {
			 mav.addObject("smsg", "Product Saved");
		}else {
			 mav.addObject("emsg", "Not Saved");
		}
		
		mav.addObject("pobj", new Product());
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/details")
	public ModelAndView getProduct() {
		ModelAndView mav=new ModelAndView();
		List<Product> products = service.getProducts();
		mav.addObject("product",products);
		mav.setViewName("data");
		return mav;
	}
	
	@PostMapping("/details")
	public ModelAndView deleteProduct(Integer id) {
		ModelAndView mav=new ModelAndView();
		Product product=new Product();
		product.setPid(id);
		service.deleteProduct(product);
		
		List<Product> products = service.getProducts();
		mav.addObject("product",products);
		mav.setViewName("data");
		return mav;
	}
	
	
	
	@PostMapping("/update")
	public ModelAndView updateProduct(Integer id) {
		ModelAndView mav=new ModelAndView();
		Product product=new Product();
		product.setPid(id);
		service.getId(product);
		
//		List<Product> products = service.getProducts();
//		mav.addObject("product",products);
		//service.saveProduct(product);
		mav.addObject("pobj",new Product());
		mav.setViewName("index2");
		return mav;
	}
	 
			
	

	




}
