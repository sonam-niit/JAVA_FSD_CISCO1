package com.cisco.mongorest.service;

import java.util.List;
import java.util.Optional;

import com.cisco.mongorest.model.Book;

public interface BookService {

	public Book createBook(Book book);
	public List<Book> getAllBooks();
	public Optional<Book> getBookById(String id);
	public void deleteBookById(String id);
	public Book updateBook(Book book, String id);
}
