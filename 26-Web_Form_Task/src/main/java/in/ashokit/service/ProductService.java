package in.ashokit.service;

import java.util.List;

import in.ashokit.bindings.Product;

public interface ProductService {
	
	public boolean saveProduct(Product p); 
		
	public List<Product> getProducts();
	
	public void deleteProduct(Product  p);
	
}
