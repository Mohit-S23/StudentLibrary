package com.mohit.library.studentlibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.library.studentlibrary.models.Author;
import com.mohit.library.studentlibrary.services.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	AuthorService authorService;
	
	@PostMapping("/createAuthor")
	public ResponseEntity createAuthor(@RequestBody Author author) {
	
		authorService.createAuthor(author);
		return new ResponseEntity<>("the author is succcessfully added to the system", HttpStatus.CREATED);
	}
}
