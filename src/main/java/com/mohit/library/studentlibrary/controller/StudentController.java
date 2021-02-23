package com.mohit.library.studentlibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.library.studentlibrary.models.Student;
import com.mohit.library.studentlibrary.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/createStudent")
	public ResponseEntity createStudent(@RequestBody Student student) {
		
		studentService.createStudent(student);
		return new ResponseEntity<>("the student is successfully added to the system", HttpStatus.CREATED);
	}

	@PutMapping("/updateStudent")
	public ResponseEntity updateStudent(@RequestBody Student student) {
		
		studentService.updateStudent(student);
		return new ResponseEntity<>("student is updated", HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteStudent")
	public ResponseEntity deleteStudent(@RequestParam("id") int id) {
		studentService.deleteStudent(id);
		return new ResponseEntity<>("student is deleted", HttpStatus.ACCEPTED);
	}
}
