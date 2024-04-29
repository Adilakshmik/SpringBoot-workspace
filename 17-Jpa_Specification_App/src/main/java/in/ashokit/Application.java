package in.ashokit;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductService bean = context.getBean(ProductService.class);
		
		//bean.saveProducts();
		
		//bean.getProducts();
		
		//bean.getProductsExample();
		List<Product> products = bean.getProductsSpec("Key",340000.00,1000.00);
		products.forEach(System.out::println);
	}

}
