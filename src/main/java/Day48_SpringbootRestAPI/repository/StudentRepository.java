package Day48_SpringbootRestAPI.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import Day48_SpringbootRestAPI.model.Student;

@Repository
public class StudentRepository {

	private List<Student> students = new ArrayList<Student>(Arrays.asList(
				new Student(1L, "Prince"),
				new Student(2L, "Jediel")
			));
	
	 public List<Student> findAll() {
	        return students;
	    }
	 
	public Student findByID(Long ID) {
		return students.stream() 
						.filter(s -> s.getID().equals(ID))
						.findFirst()
						.orElse(null);
	}
	
	public Student save(Student student) {
		students.add(student);
		return student;
	}
	
	public void deleteByID(Long ID) {
		students.removeIf(s -> s.getID().equals(ID));
	}
}
