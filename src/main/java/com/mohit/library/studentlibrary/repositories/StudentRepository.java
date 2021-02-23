package com.mohit.library.studentlibrary.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mohit.library.studentlibrary.models.Student;

@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer>{

	// JPQL - Java Persistence Query Language // objects and attributes
	// Native SQL Query // columns and tables
	
	@Modifying
	@Query("update Student s set s.emailId = :#{#std.emailId}, " + 
			"s.name = :#{#std.name}, " +
			"s.age = :#{#std.age}, " +
			"s.country = :#{#std.country} " +
			"where s.id = :#{#std.id}")
	int updateStudentDetails(Student std);
	
	@Modifying
	@Query(value = "delete from Student s where s.id =:id")
	void deleteCustom(int id);
}