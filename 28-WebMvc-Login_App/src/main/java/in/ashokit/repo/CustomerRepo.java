package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.bindings.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	
	public Customer findByCemailAndCpwd(String cemail,String cpwd);
	
	
	@Modifying
    @Transactional
    @Query("update Customer c set c.cpwd = :newPwd where c.cemail = :cemail")
    int updateCustomerPassword(String cemail, String newPwd);
}
