package com.beans;

public class MovieDTO {
	private int m_uid;
	private String m_name;
	private int m_db_id;
	private int m_kobis_id;
	public MovieDTO() {
		super();
	}
	public MovieDTO(int m_uid, String m_name, int m_db_id, int m_kobis_id) {
		super();
		this.m_uid = m_uid;
		this.m_name = m_name;
		this.m_db_id = m_db_id;
		this.m_kobis_id = m_kobis_id;
	}
	public int getM_uid() {
		return m_uid;
	}
	public void setM_uid(int m_uid) {
		this.m_uid = m_uid;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getM_db_id() {
		return m_db_id;
	}
	public void setM_db_id(int m_db_id) {
		this.m_db_id = m_db_id;
	}
	public int getM_kobis_id() {
		return m_kobis_id;
	}
	public void setM_kobis_id(int m_kobis_id) {
		this.m_kobis_id = m_kobis_id;
	}
	
	
}
