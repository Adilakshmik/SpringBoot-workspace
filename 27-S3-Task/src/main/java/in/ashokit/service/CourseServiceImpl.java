package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.bindings.Course;
import in.ashokit.repo.CourseRepo;

public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepo repo;
	
	@Override
	public void saveCourse(Course course) {
		
		
	}

}
