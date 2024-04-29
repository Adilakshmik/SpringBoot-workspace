package in.ashokit;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("chip32")


@Primary
public class Chip32Bit implements Ichip {
	
	public Chip32Bit() {
		System.out.println("Chip32::constructor");
	}

	@Override
	public boolean process() {
		System.out.println("Chip32Bit processing");
		return true;
	}

}
