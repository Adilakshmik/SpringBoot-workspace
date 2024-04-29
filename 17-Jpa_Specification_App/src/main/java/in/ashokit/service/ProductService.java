package in.ashokit.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;
import in.ashokit.spec.ProductSpecification;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
	
	public void saveProducts() {
		Product p1=new Product();
		p1.setCategory("Mobiles");
		p1.setPname("MI");
		p1.setPrice(10000.00);
		
		Product p2=new Product();
		p2.setCategory("Mobiles");
		p2.setPname("Moto");
		p2.setPrice(20000.00);
		
		Product p3=new Product();
		p3.setCategory("Mobiles");
		p3.setPname("Vivo");
		p3.setPrice(30000.00);
		
		Product p4=new Product();
		p4.setCategory("Mobiles");
		p4.setPname("Samsung");
		p4.setPrice(40000.00);
		
		List<Product> saveAll = repo.saveAll(Arrays.asList(p1,p2,p3,p4));
		}
	
	public void getProducts() {
		List<Product> all = repo.findAll();
//		Iterator<Product> iterator = all.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		all.forEach(System.out::println);
	}
	
	public void getProductsExample() {
		Product entity=new Product();
		entity.setCategory("Mobiles");
		entity.setPname("Vivo");
		entity.setPrice(30000.00);
		Example<Product> example = Example.of(entity);
		List<Product> all = repo.findAll(example);
		all.forEach(System.out::println);
		
	}
	
	public List<Product> getProductsSpec(String pname,Double maxPrice,Double minPrice) {
		
		Specification<Product> spec = Specification.where(null);
		if(spec!=null) {
		spec = spec.and(ProductSpecification.nameLike(pname));
		}
		if(spec!=null) {
			spec=spec.and(ProductSpecification.priceLessThanEqual(maxPrice));
		}
		if(spec!=null) {
			spec=spec.and(ProductSpecification.priceGreaterThanEqual(minPrice));
		    }
			
		
		return repo.findAll(spec);
//		Iterator<Product> iterator = all.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
}
}
