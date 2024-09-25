package student.management.services;

import java.util.List;

import student.management.entity.Student;

public interface StudentService {

	String addStudent (Student st);

	Student searchStudent(int roll);

	String updateStudent(Student st);

	String deleteStudent(int roll);

	List<Student> fetchAllStudents();

	String  deleteAllStudent();

	

	
	
	
}
