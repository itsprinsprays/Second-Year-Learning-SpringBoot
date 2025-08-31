package Day48_SpringbootRestAPI.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Day48_SpringbootRestAPI.model.Student;
import Day48_SpringbootRestAPI.service.StudentService;

import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	private final StudentService serv;
	 
	public StudentController(StudentService serv) {
		this.serv = serv;
	}
	
	@GetMapping
	public List<Student> getStudents() {
		return serv.getAllStudents();
	}
	
	@GetMapping("/{ID}")
	public Student getStudent(@PathVariable Long ID) {
		return serv.getStudentByID(ID);
	}
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return serv.addStudent(student);
	}
	
	@DeleteMapping("/{ID}")
	public String deleteStudent(@PathVariable Long ID) {
		serv.deleteStudent(ID);
		return "Deleted Student with ID " + ID;
	}
	
	

}
