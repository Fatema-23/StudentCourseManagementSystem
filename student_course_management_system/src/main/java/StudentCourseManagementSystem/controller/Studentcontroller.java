package StudentCourseManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import StudentCourseManagementSystem.main.model.Student;
import StudentCourseManagementSystem.repository.StudentRepository;

@Controller
@ControllerAdvice

public class Studentcontroller {
	@Autowired
	StudentRepository sr;
	
    @GetMapping("/home")       
	public String homepage() {
		
		return "home.html";
	}
	
	@PostMapping("/addStudent")		
	public String addStudent(@ModelAttribute Student student) {
		
		sr.save(student);
		return "redirect:/home" ;
		
	}
	
	
	@PostMapping("/findById")		
	public String findById(@RequestParam int sId, Model m) {
		
		Student s = sr.getOne(sId);
		m.addAttribute("student" ,s);
		return "student.html" ;
		
	}
	
	@PostMapping("/findBysCourse")		
	public String findBysCourse(@RequestParam String sCourse, Model m) {
		
		List<Student> s = sr.findBysCourse(sCourse);
		m.addAttribute("students" ,s);
		return "allstudent.html" ;
		
	}
	
	@GetMapping("/deleteStudent")		
	public String deleteStudent(@RequestParam int sId) {
		
		sr.deleteById(sId);
		return "redirect:/home" ;
		
	}
	
	@PostMapping("/updateStudent")		
	public String updateStudent(@ModelAttribute Student student) {
		Student s = sr.getOne(student.getsId());
		s.setsName(student.getsName());
		s.setsAdYear(student.getsAdYear());
		s.setsAddress(student.getsAddress());
		s.setsPhone(student.getsPhone());
		s.setsEmail(student.getsEmail());
		s.setsCourse(student.getsCourse());
		
		sr.save(student);
		return "redirect:/home" ;
		
	}
	

}
