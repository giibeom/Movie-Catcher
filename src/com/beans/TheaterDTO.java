package com.beans;

public class TheaterDTO {
	private String theaterCode;
	private String theaterName;
	private String areaCode;
	public TheaterDTO() {
		super();
	}
	public TheaterDTO(String theaterCode, String theaterName, String areaCode) {
		super();
		this.theaterCode = theaterCode;
		this.theaterName = theaterName;
		this.areaCode = areaCode;
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

}
