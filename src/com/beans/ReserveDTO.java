package com.beans;

public class ReserveDTO {
	private int rs_num;
	private String rs_date;
	private int rs_price;
	private String rs_seat;
	private int u_idnum;
	private int t_uid;
	public ReserveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReserveDTO(int rs_num, String rs_date, int rs_price, String rs_seat, int u_idnum, int t_uid) {
		super();
		this.rs_num = rs_num;
		this.rs_date = rs_date;
		this.rs_price = rs_price;
		this.rs_seat = rs_seat;
		this.u_idnum = u_idnum;
		this.t_uid = t_uid;
	}
	public int getRs_num() {
		return rs_num;
	}
	public void setRs_num(int rs_num) {
		this.rs_num = rs_num;
	}
	public String getRs_date() {
		return rs_date;
	}
	public void setRs_date(String rs_date) {
		this.rs_date = rs_date;
	}
	public int getRs_price() {
		return rs_price;
	}
	public void setRs_price(int rs_price) {
		this.rs_price = rs_price;
	}
	public String getRs_seat() {
		return rs_seat;
	}
	public void setRs_seat(String rs_seat) {
		this.rs_seat = rs_seat;
	}
	public int getU_idnum() {
		return u_idnum;
	}
	public void setU_idnum(int u_idnum) {
		this.u_idnum = u_idnum;
	}
	public int getT_uid() {
		return t_uid;
	}
	public void setT_uid(int t_uid) {
		this.t_uid = t_uid;
	}
	
}