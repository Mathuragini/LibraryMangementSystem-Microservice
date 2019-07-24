package com.library.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // specifies that the class is an entity and is mapped to a database table
@Table(schema="libraryapp", name="mainClassification") //specifies the name of the database table to be used for mapping.
public class Book {
	
	@Id // specifies the primary key of an entity (id is primary key)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //provides for the specification of generation strategies for the values of primary keys.
	private Long bookId;
	private String bookName;
	private String bookISBN;
	
	//Generate Getters and Setters
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//Generate constructor using fields
	public Book(Long bookId, String bookName, String bookISBN) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookISBN = bookISBN;
	}
	
	
}
