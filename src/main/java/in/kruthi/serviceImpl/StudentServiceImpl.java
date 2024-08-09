package in.kruthi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kruthi.entity.Student;
import in.kruthi.repository.StudentRepository;
import in.kruthi.service.StudentInterface;

@Service
public class StudentServiceImpl implements StudentInterface{

	@Autowired
	private StudentRepository studentrepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentrepo.findById(id).get();
	}

	@Override
	public String deleteStudent(Integer id) {
		// TODO Auto-generated method stub
        Student student=studentrepo.findById(id).get();
		
		if(student!=null) {
			studentrepo.delete(student);
			return "Product Delete Sucessfully";
		}
		return "Something wrong on server";
	}

	@Override
	public Student editStudent(Student s, Integer id) {
		// TODO Auto-generated method stub
		Student preStudent = studentrepo.findById(id).get();

		preStudent.setStudentName(s.getStudentName());
		preStudent.setBranch(s.getBranch());
		preStudent.setStudentEmail(s.getStudentEmail());
		preStudent.setPhoneNo(s.getPhoneNo());
		preStudent.setStudentAge(s.getStudentAge());

		return studentrepo.save(preStudent);
	}

}
