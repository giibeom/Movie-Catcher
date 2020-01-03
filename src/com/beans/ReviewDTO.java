package com.beans;

public class ReviewDTO {
	private int rv_num;
	private String rv_title;
	private String rv_content;
	private double rv_star;
	private int rs_num;
	public ReviewDTO() {
		super();
	}
	public ReviewDTO(int rv_num, String rv_title, String rv_content, double rv_star, int rs_num) {
		super();
		this.rv_num = rv_num;
		this.rv_title = rv_title;
		this.rv_content = rv_content;
		this.rv_star = rv_star;
		this.rs_num = rs_num;
	}
	public int getRv_num() {
		return rv_num;
	}
	public void setRv_num(int rv_num) {
		this.rv_num = rv_num;
	}
	public String getRv_title() {
		return rv_title;
	}
	public void setRv_title(String rv_title) {
		this.rv_title = rv_title;
	}
	public String getRv_content() {
		return rv_content;
	}
	public void setRv_content(String rv_content) {
		this.rv_content = rv_content;
	}
	public double getRv_star() {
		return rv_star;
	}
	public void setRv_star(double rv_star) {
		this.rv_star = rv_star;
	}
	public int getRs_num() {
		return rs_num;
	}
	public void setRs_num(int rs_num) {
		this.rs_num = rs_num;
	}
	
	
}