package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.PersonalData;

public interface Repo extends CrudRepository<PersonalData,Integer>{

}
