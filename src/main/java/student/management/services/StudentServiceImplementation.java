package student.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.management.entity.Student;
import student.management.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	
	@Autowired
	StudentRepository repo;
	//add
	public String addStudent(Student st) {
		repo.save(st);
		return "student addedl";
	}
//search
	public Student searchStudent(int roll) {
		return repo.findById(roll).get();
	}
	//update
	public String updateStudent(Student st) {
		repo.save(st);
		return "student updated";
	}
	//delete
	public String  deleteStudent(int roll) {
		
		repo.deleteById(roll);
		return "student deleted";
	}
	
//readAll 
	public List<Student> fetchAllStudents(){
		return repo.findAll();
	}
	
	//delete All data
	public String  deleteAllStudent(){
		repo.deleteAll();
		return "all student deleted!";
	}
	
}
