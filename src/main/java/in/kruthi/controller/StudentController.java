package in.kruthi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.kruthi.entity.Student;
import in.kruthi.service.StudentInterface;

@RestController
public class StudentController {
	 
	@Autowired
	private StudentInterface students;

	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		return new ResponseEntity<>(students.saveStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllStudent(){
		return new ResponseEntity<>(students.getAllStudent(),HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Integer id){
		return new ResponseEntity<>(students.getStudentById(id), HttpStatus.OK);
		
	}
	
	@PostMapping("/deleteStudent/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable Integer id){
		return new ResponseEntity<>(students.deleteStudent(id), HttpStatus.OK);
		
	}
	
	@PostMapping("/editStudentt/{id}")
	public ResponseEntity<?> editStudent(@RequestBody Student student, @PathVariable Integer id) {
		return new ResponseEntity<>(students.editStudent(student, id), HttpStatus.CREATED);

}
}
