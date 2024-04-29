package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
	
public config () {
	System.out.println("config :: constructor");
}

@Bean
 public int print() {
		System.out.println("inside print method ");
		return new config().hashCode();
	}
 
	
		
		
 
 }





