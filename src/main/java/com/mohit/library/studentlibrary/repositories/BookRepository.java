package com.mohit.library.studentlibrary.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mohit.library.studentlibrary.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	@Query("select b from Book b where b.available =:availability and b.author in (select a from Author a where a.name =:author_name)")
	List<Book> findBooksByAuthor(String author_name, boolean availability);
	
	@Query("select b from Book b where b.genre =:genre and b.available =:availability")
	List<Book> findBooksByGenre(String genre, boolean availability);
	
	@Query("select b from Book b where b.available =:availability and b.genre =:genre and b.author in (select a from Author a where a.name =:author_name)")
	List<Book> findBooksByGenreAuthor(String genre, String author, boolean availability);
	
	@Query("select b from Book b where b.available =:availability")
	List<Book> findByAvailability(boolean availability);
	
	@Modifying
	@Transactional
	@Query("update Book b set b.available =:#{#book.available}, b.card =:#{#book.card} where b.id =:#{#book.id}")
	int updateBook(Book book);
}
