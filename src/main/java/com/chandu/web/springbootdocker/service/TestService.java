package com.chandu.web.springbootdocker.service;

import java.util.List;

import com.chandu.web.springbootdocker.model.Student;

public interface TestService {
	public Student createStudent(Student student);
	public List<Student> getStudentList();

}
