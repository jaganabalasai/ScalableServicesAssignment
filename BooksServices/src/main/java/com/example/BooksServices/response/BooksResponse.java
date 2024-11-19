package com.example.BooksServices.response;

public class BooksResponse {

	private int BookID;
	
	private String Title;
	
	private String Author;
	
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
