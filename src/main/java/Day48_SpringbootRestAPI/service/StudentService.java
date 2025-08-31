package Day48_SpringbootRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Day48_SpringbootRestAPI.model.Student;
import Day48_SpringbootRestAPI.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository repo;
	
	public StudentService(StudentRepository repo) {
		this.repo = repo;
	}
	
	public List<Student> getAllStudents() {
		return repo.findAll();
	}
	
	public Student getStudentByID(Long id) {
		return repo.findByID(id);
	}
	
	public Student addStudent(Student student) {
		return repo.save(student);
	}
	
	public void deleteStudent(Long ID) {
		 repo.deleteByID(ID);
	}
	
	

}
