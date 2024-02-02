package com.cisco.mongorest.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.mongorest.model.Book;
import com.cisco.mongorest.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookService service;
	
	@PutMapping("{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, 
			@PathVariable String id){
		Book exBook= service.getBookById(id).orElse(null);
		if(exBook!=null) {
			return ResponseEntity.ok().body(service.updateBook(book, id));
		}
		return ResponseEntity.notFound().build();
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteBook(@PathVariable String id){
		Book exBook= service.getBookById(id).orElse(null);
		if(exBook!=null) {
			service.deleteBookById(id);
			return ResponseEntity.ok().body("User Deleted Successfully");
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks(){
		return ResponseEntity.ok().body(service.getAllBooks());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Book> getBookById(@PathVariable String id){
		return service.getBookById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Book> createNewBook(@RequestBody Book book){
		Book createdBook= service.createBook(book);
		String location="/api/books/"+createdBook.getId();
		return ResponseEntity.created(URI.create(location)).body(createdBook);
	}
}








