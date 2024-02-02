package com.cisco.mongorest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.mongorest.model.Book;
import com.cisco.mongorest.repo.BookRepository;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository repository;
	@Override
	public Book createBook(Book book) {
		return repository.save(book);
	}
	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}
	@Override
	public Optional<Book> getBookById(String id) {
		return repository.findById(id);
	}
	@Override
	public void deleteBookById(String id) {
		repository.deleteById(id);;
	}
	@Override
	public Book updateBook(Book book, String id) {
		Book exBook= repository.findById(id).get();
		exBook.setName(book.getName());
		exBook.setAuthor(book.getAuthor());
		exBook.setPublicationYear(book.getPublicationYear());
		return repository.save(exBook);
	}

}
