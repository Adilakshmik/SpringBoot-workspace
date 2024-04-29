package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.CounsellorEntity;


public interface StudentRepo extends JpaRepository<CounsellorEntity,Integer>{

}
