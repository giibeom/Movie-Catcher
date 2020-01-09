package com.beans;

public class BoardDTO {
	private int b_num;
	private String b_title;
	private String b_content;
	private String b_regdate;
	private int a_uid;
	public BoardDTO() {
		super();
	}
	public BoardDTO(int b_num, String b_title, String b_content, int a_uid) {
		super();
		this.b_num = b_num;
		this.b_title = b_title;
		this.b_content = b_content;
		this.a_uid = a_uid;
	}
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getB_regdate() {
		return b_regdate;
	}
	public void setB_regdate(String b_regdate) {
		this.b_regdate = b_regdate;
	}
	public int getA_uid() {
		return a_uid;
	}
	public void setA_uid(int a_uid) {
		this.a_uid = a_uid;
	}
	
	
}
