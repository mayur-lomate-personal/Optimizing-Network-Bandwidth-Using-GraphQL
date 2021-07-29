package com.mayur.graphqlpractice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "author")
public class Author {
	
	@Transient
    public static final String SEQUENCE_NAME = "author_sequence";

	@Id
	private Long aid;
	private String name;
	private String thumbnail;
	
	public Author() {
		super();
	}

	public Author(Long aid, String name, String thumbnail) {
		super();
		this.aid = aid;
		this.name = name;
		this.thumbnail = thumbnail;
	}
	
	public Long getAid() {
		return aid;
	}
	public void setAid(Long aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
