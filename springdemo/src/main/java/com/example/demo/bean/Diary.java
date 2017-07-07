package com.example.demo.bean;

public class Diary {
	private int id;
	private String title;
	private String content;
	private String pubTime;
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPubTime() {
		return pubTime;
	}
	public void setPubTime(String pubTime) {
		this.pubTime = pubTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Diary [id=" + id + ", title=" + title + ", content=" + content + ", pubTime=" + pubTime + ", userId="
				+ userId + "]";
	}
	
}
