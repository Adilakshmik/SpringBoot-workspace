package in.ashokit.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.EmpEntity;

public interface EmpRepo extends CrudRepository<EmpEntity,Integer>{
	@Query("from EmpEntity ")
	public EmpEntity getEmps();
	
}
