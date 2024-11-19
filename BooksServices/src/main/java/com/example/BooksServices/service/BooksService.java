package com.example.BooksServices.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BooksServices.entity.Books;
import com.example.BooksServices.repo.BooksRepo;
import com.example.BooksServices.response.BooksResponse;

@Service
public class BooksService {

	@Autowired
	private BooksRepo BooksRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public BooksResponse getBooksbyBookID(int BookID) {
		//Books->BooksResponse
		Books books =BooksRepo.findById(BookID).get();
		BooksResponse booksResponse= modelMapper.map(books, BooksResponse.class);
		return booksResponse;
	}

	
}
