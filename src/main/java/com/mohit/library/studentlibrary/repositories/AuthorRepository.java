package com.mohit.library.studentlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohit.library.studentlibrary.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
