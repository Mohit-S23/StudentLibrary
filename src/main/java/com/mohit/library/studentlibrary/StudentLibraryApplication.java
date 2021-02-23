package com.mohit.library.studentlibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mohit.library.studentlibrary.models.Author;
import com.mohit.library.studentlibrary.models.Book;
import com.mohit.library.studentlibrary.models.Card;
import com.mohit.library.studentlibrary.models.Genre;
import com.mohit.library.studentlibrary.models.Student;
import com.mohit.library.studentlibrary.repositories.AuthorRepository;
import com.mohit.library.studentlibrary.repositories.BookRepository;
import com.mohit.library.studentlibrary.repositories.CardRepository;
import com.mohit.library.studentlibrary.repositories.StudentRepository;
import com.mohit.library.studentlibrary.services.StudentService;

@SpringBootApplication
public class StudentLibraryApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentLibraryApplication.class, args);
	}
	
	@Autowired
	StudentRepository studentRepository;
	// cannot use @Autowired with static: it will cause NullPointerException
	
	@Autowired
	CardRepository cardRepository;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student("wxyz@gmail.com", "WXYZ", 40, "US");
//		Card card = new Card();
//		
//		// Bi-Directioanl Relationship
//		card.setStudent(student);
//		student.setCard(card);
//		
//		// saving parent will automatically save child
//		cardRepository.save(card);
		
//		Author author = new Author("William", "william@gmail.com", 45, "Italy");
//		Book book = new Book("Human Psychology", Genre.FICTIONAL, author);
//		
//		authorRepository.save(author);
//		bookRepository.save(book);
		
		// studentRepository.save(student) : cause error because parent i.e. card is not present yet
	}

}
