package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	private String code;
	private String title;
	private String author;
	private String publisher;
	private Integer price;
	
	public Book() {
		super();
	}

	public Book(String code, String title, String author, String publisher,
			Integer price) {
		super();
		this.code = code;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	@Id
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
