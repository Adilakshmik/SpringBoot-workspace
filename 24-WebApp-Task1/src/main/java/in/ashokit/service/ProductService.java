package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Controller
@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	
	public void saveProduct() {
		
	Product entity=new Product();
	entity.setPname("Mobile");
	entity.setPrice(25000.00);
	repo.save(entity);
	}
	
	public void deleteProduct() {
		repo.deleteById(6);
	}
	
	@GetMapping("/displayproducts")
	public ModelAndView getProduct() {
		ModelAndView mav=new ModelAndView();
		List<Product> all = repo.findAll();
		mav.addObject("products", all);
		mav.setViewName("index");
		
		return mav;
	}
}
