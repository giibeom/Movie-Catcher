package com.beans;

public class MC_adminDTO {
	private int a_uid;
	private String a_id;
	private String a_pw;
	private String a_regdate;
	
	public MC_adminDTO() {
		super();
	}
	public MC_adminDTO(int a_uid, String a_id, String a_pw, String a_regdate) {
		super();
		this.a_uid = a_uid;
		this.a_id = a_id;
		this.a_pw = a_pw;
		this.a_regdate = a_regdate;
	}
	public int getA_uid() {
		return a_uid;
	}
	public void setA_uid(int a_uid) {
		this.a_uid = a_uid;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getA_pw() {
		return a_pw;
	}
	public void setA_pw(String a_pw) {
		this.a_pw = a_pw;
	}
	public String getA_regdate() {
		return a_regdate;
	}
	public void setA_regdate(String a_regdate) {
		this.a_regdate = a_regdate;
	}
	
	
}
