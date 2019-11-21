package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	//...<Student is object......,data type of primary id>.....
	List<Student> findByName(String name);
	List<Student> findByIdBetween(Integer start,Integer stop);
	List<Student> findByPassIgnoreCase(String name);
	
}
