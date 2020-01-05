package com.beans;

public class TheaterDTO {
	private String theaterCode;
	private String theaterName;
	private String areaCode;
	private String theaterAddress;
	private double theaterX;
	private double theaterY;
	public TheaterDTO() {
		super();
	}
	public TheaterDTO(String theaterCode, String theaterName, String areaCode, String theaterAddress, double theaterX, double theaterY) {
		super();
		this.theaterCode = theaterCode;
		this.theaterName = theaterName;
		this.areaCode = areaCode;
		this.theaterAddress = theaterAddress;
		this.theaterX = theaterX;
		this.theaterY = theaterY;
	}
	public String getTheaterCode() {
		return theaterCode;
	}
	public void setTheaterCode(String theaterCode) {
		this.theaterCode = theaterCode;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getTheaterAddress() {
		return theaterAddress;
	}
	public void setTheaterAddress(String theaterAddress) {
		this.theaterAddress = theaterAddress;
	}
	public double getTheaterX() {
		return theaterX;
	}
	public void setTheaterX(double theaterX) {
		this.theaterX = theaterX;
	}
	public double getTheaterY() {
		return theaterY;
	}
	public void setTheaterY(double theaterY) {
		this.theaterY = theaterY;
	}
	

}
