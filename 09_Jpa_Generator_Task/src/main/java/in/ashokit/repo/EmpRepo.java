package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.user.Emp;

public interface EmpRepo extends JpaRepository<Emp,String>{

}
