package com.chandu.web.springbootdocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.web.springbootdocker.model.Student;
import com.chandu.web.springbootdocker.service.TestService;

@RestController
@RequestMapping(value="/api/v1")
public class TestController {
	@Autowired
	TestService service;
	@GetMapping("/")
	public String test() {
		return "test the application";
	}
	@PostMapping(value="/addStudent")
	public String addStudent(@RequestBody Student student) {
		Student st = service.createStudent(student);
		System.out.println(st);
		return "student data inserted successfully";
		
	}
	@GetMapping(value="studentList")
	public List<Student> getStudentList(){
		List<Student> studentList = service.getStudentList();
		return studentList;
	}
	
}
