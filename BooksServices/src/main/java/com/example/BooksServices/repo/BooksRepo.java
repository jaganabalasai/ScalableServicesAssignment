package com.example.BooksServices.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BooksServices.entity.Books;

public interface BooksRepo extends JpaRepository<Books, Integer>{

}
