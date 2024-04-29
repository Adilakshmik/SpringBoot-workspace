package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.bindings.Course;

public interface CourseRepo extends JpaRepository<Course,Integer>{

}
