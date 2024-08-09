package in.kruthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kruthi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
