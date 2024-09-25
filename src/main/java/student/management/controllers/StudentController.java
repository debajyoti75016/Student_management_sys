package student.management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import student.management.entity.Student;
import student.management.services.StudentService;





@Controller
public class StudentController {
//	@GetMapping("/acceptStudent")
//	public String acceptStudent(
//			@RequestParam int roll,
//			@RequestParam 	String name,
//			@RequestParam 	String branch,
//			@RequestParam 	int yop,
//			@RequestParam 	double cgpa
//			
//			
//			) {
//		Student st= new Student(roll,name,branch,yop,cgpa);
//	
//		
//		System.out.println(st);
//		return "student data received succesfully";
//	}
	//Add student 
	@Autowired
	StudentService service;
private int roll;
//	add student
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute Student  st) {
		service.addStudent(st);
		return "index";
		}
	
	//read student
	//org.springframework.ui.model
	@GetMapping("/searchStudent")
	public String  searchStudent(@RequestParam int roll,Model model) {
		Student st=service.searchStudent(roll);
		model.addAttribute("student",st);
		return "displayStudent";
	}
	
	//update student 
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student st) {
		service.updateStudent(st);
		return "index";
	}
	
	
//DELETE
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int roll ) {
		service.deleteStudent(roll);
		return "index";
	}
	
	//fetching all data
	@GetMapping("/fetchAllStudents")
	public String fetchAllStudents(Model model) {
		List<Student>stList=service.fetchAllStudents();
		model.addAttribute("studentList",stList);
		return "displayAllStudent";
	}
	
	//delete all data
	
	@GetMapping ("/deleteAllStudent") 
	public String deleteAllStudent(){
		service.deleteAllStudent();
		return " index";
	}
	
	

}
