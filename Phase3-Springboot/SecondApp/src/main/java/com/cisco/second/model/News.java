package com.cisco.second.model;

public class News {

	private String author;
	private String title;
	private String description;
	public News() {}
	public News(String author, String title, String description) {
		super();
		this.author = author;
		this.title = title;
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "News [author=" + author + ", title=" + title + ", description=" + description + "]";
	}
	
}