package com.chandu.web.springbootdocker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.web.springbootdocker.model.Student;
import com.chandu.web.springbootdocker.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService{
	@Autowired
	TestRepository repository;
	
	public Student createStudent(Student student) {
		return repository.save(student);
	}
	
	public List<Student> getStudentList(){
		List<Student> studentList = repository.findAll();
		return studentList;
	}
}
