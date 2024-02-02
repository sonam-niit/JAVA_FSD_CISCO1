package com.cisco.mongorest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mybook")
public class Book {

	@Id
	private String id;
	private String name;
	private String author;
	private String publicationYear;
	public Book() {}
	public Book(String name, String author, String publicationYear) {
		super();
		this.name = name;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publicationYear=" + publicationYear
				+ "]";
	}
	
}
