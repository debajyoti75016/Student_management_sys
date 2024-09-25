package student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.management.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{
	

}
