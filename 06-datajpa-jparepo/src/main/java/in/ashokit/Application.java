package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpService bean = context.getBean(EmpService.class);
		//bean.saveEmps();
		
//		List<Employee> allEmps = bean.getAllEmps();
//		System.out.println(allEmps);
		
		//bean.sortAllEmps();
		
		//bean.sortAllEmps1();
		
		//bean.getAllEmpsPagenation();
		
		bean.getAllEmpsWithFilter();
	}

}
