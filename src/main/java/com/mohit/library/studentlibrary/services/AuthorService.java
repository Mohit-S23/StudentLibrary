package com.mohit.library.studentlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.library.studentlibrary.models.Author;
import com.mohit.library.studentlibrary.repositories.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	AuthorRepository authorRepository;
	
	public void createAuthor(Author author) {
		authorRepository.save(author);
	}
}
