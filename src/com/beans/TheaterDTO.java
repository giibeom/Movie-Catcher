package com.beans;

public class TheaterDTO {
	private String theaterCode;
	private String theaterName;
	private String areaCode;
	private String theaterAddress;
	
	public TheaterDTO() {
		super();
	}

	public TheaterDTO(String theaterCode, String theaterName, String areaCode, String theaterAddress) {
		super();
		this.theaterCode = theaterCode;
		this.theaterName = theaterName;
		this.areaCode = areaCode;
		this.theaterAddress = theaterAddress;
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
	
}
