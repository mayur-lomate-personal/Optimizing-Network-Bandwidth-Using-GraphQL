package com.mayur.graphqlpractice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Post")
public class Post {
	
	@Transient
    public static final String SEQUENCE_NAME = "post_sequence";

	@Id
	private Long pid;
	private String title;
	private String category;
	private String text;
	private Long aid;
	
	@Transient
	private Author author;
	
	public Post( ) {
		
	}
	
	public Post(Long id, String title, String category, String text, Long aid) {
		super();
		this.pid = id;
		this.title = title;
		this.category = category;
		this.text = text;
		this.aid = aid;
	}
	
	public Long getAid() {
		return aid;
	}

	public void setAid(Long aid) {
		this.aid = aid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
