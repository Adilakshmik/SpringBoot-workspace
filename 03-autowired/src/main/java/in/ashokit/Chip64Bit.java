package in.ashokit;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


	
@Component

//@Component("Chip64Bit")it is one way of autowiring(byName)
//@Qualifier("chip64")second way of  autowiring(byName)
//@Primary (3rd way of autowiring(byTame))

public class Chip64Bit implements Ichip {
	
	public Chip64Bit() {
		System.out.println("Chip64::constructor");
	}

	public boolean process() {
		System.out.println("Chip64Bit processing");
		
		return true;
	}

}
