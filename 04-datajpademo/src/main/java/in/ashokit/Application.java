package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.ContactsMasterEntity;
import in.ashokit.repo.ContactRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactRepo bean = context.getBean(ContactRepo.class);
		
		ContactsMasterEntity entity= new ContactsMasterEntity();

		
		entity.setContactId(101);
		entity.setContactName("Charles");
		entity.setContactNum(7643274672l);
		
		bean.save(entity);
	}

}
