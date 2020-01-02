package com.beans;

public class TicketDTO {
	private int t_uid;
	private String movietime;
	private int restSeat;
	private int h_uid;
	public TicketDTO() {
		super();
	}
	public TicketDTO(int t_uid, String movietime, int restSeat, int h_uid) {
		super();
		this.t_uid = t_uid;
		this.movietime = movietime;
		this.restSeat = restSeat;
		this.h_uid = h_uid;
	}
	public int getT_uid() {
		return t_uid;
	}
	public void setT_uid(int t_uid) {
		this.t_uid = t_uid;
	}
	public String getMovietime() {
		return movietime;
	}
	public void setMovietime(String movietime) {
		this.movietime = movietime;
	}
	public int getRestSeat() {
		return restSeat;
	}
	public void setRestSeat(int restSeat) {
		this.restSeat = restSeat;
	}
	public int getH_uid() {
		return h_uid;
	}
	public void setH_uid(int h_uid) {
		this.h_uid = h_uid;
	}
}
