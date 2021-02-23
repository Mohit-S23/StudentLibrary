package com.mohit.library.studentlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.library.studentlibrary.models.Card;
import com.mohit.library.studentlibrary.models.CardStatus;
import com.mohit.library.studentlibrary.models.Student;
import com.mohit.library.studentlibrary.repositories.CardRepository;

@Service
public class CardService {

	@Autowired
	CardRepository cardRepository;
	
	public Card createAndReturn(Student student) {
		Card card = new Card();
		card.setStudent(student);
		student.setCard(card);
		
		cardRepository.save(card);
		
		return card;
	}
	
	public void deactivateCard(int student_id) {
		cardRepository.deactivateCard(student_id, CardStatus.DEACTIVATED.toString()); 
	}
}
