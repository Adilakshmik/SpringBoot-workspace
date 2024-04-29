package in.ashokit.converters;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.bindings.Customer;

public class App {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
				App app =new App();
				app.convertJsonToJava();
	}
	
	public void converJavaToJson() throws StreamWriteException, DatabindException, IOException {
	Customer c=new Customer(101,"malini",6876786888l);

	ObjectMapper mapper =new ObjectMapper();
	mapper.writeValue(new File("Customer.json"), c);
	System.out.println("Serialization completed");
	
	}
	
	public void convertJsonToJava() throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper =new ObjectMapper();
		Customer customer = mapper.readValue(new File("Customer.json"), Customer.class);
		System.out.println(customer);
		
	}

}
