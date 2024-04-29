package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Robot {
	
	@Autowired
	
	//@Qualifier("chip32")
	private Ichip chip;
	
	public Robot() {
		System.out.println("Robot::constructor");
		
	}
	
	
	
	public void doWork() {
	boolean status=chip.process();
	if(status) {
		System.out.println("chip is working");
		}else {
			System.out.println("invalid");
		}
	}
}
