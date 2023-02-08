package StudentCourseManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import StudentCourseManagementSystem.main.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student>findBysCourse(String sCourse);
	
	

}
