package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo repo;

	@Override
	public boolean saveProduct(Product p) {
		Product saved = repo.save(p);
		return saved.getPid()!=null;
	
	}

	@Override
	public List<Product> getProducts() {
		List<Product> all = repo.findAll();
		return all;
	}

	@Override
	public void deleteProduct(Product list) {
		 repo.deleteById(list.getPid());
		}
	
	public Product getId(Product product) {
		      repo.findById(product.getPid());
		    return product;
		 
		 
		
	}	
}
	

