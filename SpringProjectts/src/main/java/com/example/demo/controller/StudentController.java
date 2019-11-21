package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.beans.Student;
import com.example.demo.repository.StudentRepo;

import java.util.List;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
		@GetMapping("/student")
	public String showHomePage() {
			return "index";
		}
		@PostMapping("/insert")
		public String insert(Student insert,Model model) {
			repo.save(insert);
			model.addAttribute("insert",insert);
			return "success";
		}
		
		@GetMapping("student/all")
		public String getStudents(Model model) {
		List<Student> list = new ArrayList<Student>();
		list=repo.findAll();
		model.addAttribute("list",list);
		return "view";
		}
		@GetMapping("student/byname")
		public String getStudent(Model model) {
		List<Student> list = new ArrayList<Student>();
		list=repo.findByName("ashna");
		model.addAttribute("list",list);
		return "view";
		}
		@GetMapping("student/bypass")
		public String getStudentss(Model model) {
		List<Student> list = new ArrayList<Student>();
		list=repo.findByPassIgnoreCase("ashna");
		model.addAttribute("list",list);
		return "view";
		}
		@GetMapping("student/byid")
		public String getStudentsss(Model model) {
		List<Student> list = new ArrayList<Student>();
		list=repo.findByIdBetween(1,5);
		model.addAttribute("list",list);
		return "view";
		}
		@RequestMapping(value="deletelist/{id}",method=RequestMethod.GET)    
		   public String delete(@PathVariable int id){    
		       repo.deleteById(id);    
		       return "view";   
		   }  
		
		}
