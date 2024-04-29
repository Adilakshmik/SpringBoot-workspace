package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.ContactsMasterEntity;


public interface ContactRepo 
				extends JpaRepository<ContactsMasterEntity, Serializable>{

}
