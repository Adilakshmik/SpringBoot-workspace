package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Robot bean = context.getBean(Robot.class);
		bean.doWork();
		
//		System.out.println(bean.hashCode());
//		Robot bean1 = context.getBean(Robot.class);
//		System.out.println(bean1.hashCode());
	}

}
