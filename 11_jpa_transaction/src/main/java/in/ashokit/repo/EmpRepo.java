package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.EmpEntity;

public interface EmpRepo extends JpaRepository<EmpEntity,Integer>{
	
}
