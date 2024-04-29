package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.PersonEntity;
import in.ashokit.entity.PersonPks;

public interface PersonRepo extends JpaRepository<PersonEntity,PersonPks>{

}
