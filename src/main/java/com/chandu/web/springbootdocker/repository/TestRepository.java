package com.chandu.web.springbootdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandu.web.springbootdocker.model.Student;

@Repository
public interface TestRepository extends JpaRepository<Student, Integer> {

}
