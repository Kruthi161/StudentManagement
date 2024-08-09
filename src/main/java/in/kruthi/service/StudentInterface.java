package in.kruthi.service;

import java.util.List;

import in.kruthi.entity.Student;



public interface StudentInterface {

public Student saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Integer id);

	public String deleteStudent(Integer id);
	
	public Student editStudent(Student student,Integer id);
}
