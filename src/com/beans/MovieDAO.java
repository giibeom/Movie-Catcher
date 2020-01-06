package com.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import common.D;

public class MovieDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	// DAO 객체가 생성될때 Connection도 생성된다.
	public MovieDAO() {
		conn = ConnectionDAO.getConnection();
	}
	//DB 자원반납 메소드
	public void close() throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
	public int insert(MovieDTO dto) throws SQLException{
		String movieName = dto.getM_name();
		
		return this.insert(movieName);
	}
	
	public int insert(String movieName) throws SQLException{
		int cnt = 0 ;
		try {
			pstmt = conn.prepareStatement(D.SQL_MOVIE_INSERT);
			pstmt.setString(1, movieName);
			cnt = pstmt.executeUpdate();			
		} finally {
			close();
		}
		return cnt;
	}
	
	public int update(String m_db_id , String m_kobis_id , String m_name) throws SQLException{
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(D.SQL_MOVIE_UPDATE);
			pstmt.setString(1, m_db_id);
			pstmt.setString(2, m_kobis_id);
			pstmt.setString(3, m_name);
			cnt = pstmt.executeUpdate();
			
		} finally {
			close();
		}
		
		return cnt;
	}
	
	public String selectByCode(int m_uid) throws SQLException{
		int cnt = 0;
		String m_name = null;
		try {
			pstmt = conn.prepareStatement(D.SQL_MOVIE_SELECT);
			pstmt.setInt(1, m_uid);
			rs = pstmt.executeQuery();
			m_name = rs.getString("m_name");
			
		} finally {
			close();
		}
		
		return m_name;
	}
	
}
