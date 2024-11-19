package com.example.BooksServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.BooksServices.response.BooksResponse;
import com.example.BooksServices.service.BooksService;

@RestController
public class BooksController {
	@Autowired
	BooksService booksService;
	
	@GetMapping("/books/{BookID}")
	ResponseEntity<BooksResponse> getBooksDetails(@PathVariable("BookID") int BookID){
		BooksResponse booksResponse=booksService.getBooksbyBookID(BookID);
		return ResponseEntity.status(HttpStatus.OK).body(booksResponse);
	}

}
