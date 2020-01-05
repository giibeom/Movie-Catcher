package com.beans;

public class HallDTO {
	private int h_uid;
	private String hallType;
	private String hallLocation;
	private String hallSize;
	private String theaterCode;
	private int m_uid;
	public HallDTO() {
		super();
	}
	public HallDTO(int h_uid, String hallType, String hallLocation, String hallSize, String theaterCode, int m_uid) {
		super();
		this.h_uid = h_uid;
		this.hallType = hallType;
		this.hallLocation = hallLocation;
		this.hallSize = hallSize;
		this.theaterCode = theaterCode;
		this.m_uid = m_uid;
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
	public int getM_uid() {
		return m_uid;
	}
	public void setM_uid(int m_uid) {
		this.m_uid = m_uid;
	}
	
	

}
