package com.beans;

public class HandTDTO {
	private int h_uid;
	private String hallType;
	private String hallLocation;
	private String hallSize;
	private String theaterCode;
	private String h_movie;
	private int t_uid;
	private String movietime;
	private int restSeat;
	public HandTDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HandTDTO(int h_uid, String hallType, String hallLocation, String hallSize, String theaterCode,
			String h_movie, int t_uid, String movietime, int restSeat) {
		super();
		this.h_uid = h_uid;
		this.hallType = hallType;
		this.hallLocation = hallLocation;
		this.hallSize = hallSize;
		this.theaterCode = theaterCode;
		this.h_movie = h_movie;
		this.t_uid = t_uid;
		this.movietime = movietime;
		this.restSeat = restSeat;
	}
	public int getH_uid() {
		return h_uid;
	}
	public void setH_uid(int h_uid) {
		this.h_uid = h_uid;
	}
	public String getHallType() {
		return hallType;
	}
	public void setHallType(String hallType) {
		this.hallType = hallType;
	}
	public String getHallLocation() {
		return hallLocation;
	}
	public void setHallLocation(String hallLocation) {
		this.hallLocation = hallLocation;
	}
	public String getHallSize() {
		return hallSize;
	}
	public void setHallSize(String hallSize) {
		this.hallSize = hallSize;
	}
	public String getTheaterCode() {
		return theaterCode;
	}
	public void setTheaterCode(String theaterCode) {
		this.theaterCode = theaterCode;
	}
	public String getH_movie() {
		return h_movie;
	}
	public void setH_movie(String h_movie) {
		this.h_movie = h_movie;
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
	
}
