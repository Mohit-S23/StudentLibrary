package com.mohit.library.studentlibrary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.library.studentlibrary.models.Book;
import com.mohit.library.studentlibrary.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	public void createBook(Book book) {
		bookRepository.save(book);
	}
	
	public List<Book> getBooks(String genre, boolean available, String author) {
		if(genre != null && author != null) {
			return bookRepository.findBooksByGenreAuthor(genre, author, available);
		} else if(genre != null) {
			return bookRepository.findBooksByGenre(genre, available);
		} else if(author != null) {
			return bookRepository.findBooksByAuthor(author, available);
		} else {
			return bookRepository.findByAvailability(available);
		}
	}
}
