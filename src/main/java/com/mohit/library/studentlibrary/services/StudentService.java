package com.mohit.library.studentlibrary.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.library.studentlibrary.models.Card;
import com.mohit.library.studentlibrary.models.Student;
import com.mohit.library.studentlibrary.repositories.StudentRepository;

@Service
public class StudentService {
	
	private static Logger logger = LoggerFactory.getLogger(StudentService.class);

	@Autowired
	CardService cardService;
	
	@Autowired
	StudentRepository studentRepository;
	
	public void createStudent(Student student) {
		Card newCard = cardService.createAndReturn(student);
		logger.info("The card for the student {} is created with the details - {}",student, newCard);
	}
	
	public void updateStudent(Student student) {
		studentRepository.updateStudentDetails(student);
	}
	
	public void deleteStudent(int id) {
		cardService.deactivateCard(id);
		studentRepository.deleteCustom(id);
	}
}
