package com.works.userss.entities;

public class Ntv {
	
	private String title;
	private String id;
	private String published;
	private String updated;
	private String author;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Ntv(String title, String id, String published, String updated, String author, String content) {
		super();
		this.title = title;
		this.id = id;
		this.published = published;
		this.updated = updated;
		this.author = author;
		this.content = content;
	}

	
	
	
}
