package com.example.BooksServices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Books {
	//BookID, Title, Author, no_of_pages
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="BookID")
	private int BookID;
	
	@Column(name="Title")
	private String Title;
	
	@Column(name="Author")
	private String Author;
	
	@Column(name="no_of_pages")
	private String no_of_pages;

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getNo_of_pages() {
		return no_of_pages;
	}

	public void setNo_of_pages(String no_of_pages) {
		this.no_of_pages = no_of_pages;
	}
	
	
}