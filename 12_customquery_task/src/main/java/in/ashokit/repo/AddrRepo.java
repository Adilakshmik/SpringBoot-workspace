package in.ashokit.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.AddrEntity;

public interface AddrRepo extends CrudRepository<AddrEntity,Integer>{
	
	@Query("from AddrEntity ")
	public AddrEntity getAddr();

}
