package in.ashokit.spec;

import org.springframework.data.jpa.domain.Specification;

import in.ashokit.entity.Product;

public class ProductSpecification {
	public static Specification<Product> nameLike(String pname){
		return(root,query,criteriaBuilder)->criteriaBuilder.like(root.get("pname"),"%"+ pname+"%");
	}
	
	
	public static Specification<Product> priceLessThanEqual(Double maxprice){
		return (root,query,criteriaBuilder)->criteriaBuilder.lessThanOrEqualTo(root.get("price"), maxprice);
	}
	public static Specification<Product> priceGreaterThanEqual(Double minprice){
		return (root,query,criteriaBuilder)->criteriaBuilder.greaterThanOrEqualTo(root.get("price"), minprice);
	}
}
