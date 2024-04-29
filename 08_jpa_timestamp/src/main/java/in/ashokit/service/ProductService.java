package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.product.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
	
	public void saveProducts() {
		Product entity1=new Product();
		entity1.setPid(2);
		entity1.setPname("Mouse");
		entity1.setPrice(2000.00);
		
		
		repo.save(entity1);
	}
	
}
