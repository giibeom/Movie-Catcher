package com.beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.D;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
	
public class TheaterDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	// DAO 객체가 생성될때 Connection도 생성된다.
	public TheaterDAO() {}
	
	public static Connection getConnection() throws NamingException, SQLException {
		Context initContext = new InitialContext();
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/testDB");

		return ds.getConnection();
	}
	
	//DB 자원반납 메소드
	public void close() throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
	public int insert(TheaterDTO dto) throws SQLException, NamingException{
		String theaterCode = dto.getTheaterCode();
		String theaterName = dto.getTheaterName();
		String areaCode = dto.getAreaCode();
		String theaterAddress = dto.getTheaterAddress();
		
		return this.insert(theaterCode, theaterName, areaCode, theaterAddress);
	}
	
	public int insert(String theaterCode, String theaterName, String areaCode, String theaterAddress) throws SQLException, NamingException{
		int cnt = 0 ;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_THEATER_INSERT);
			pstmt.setString(1, theaterCode);
			pstmt.setString(2, theaterName);
			pstmt.setString(3, areaCode);
			pstmt.setString(4, theaterAddress);
			cnt = pstmt.executeUpdate();			
		} finally {
			close();
		}
		return cnt;
	}
	
	public TheaterDTO []  createArray(ResultSet rs) throws SQLException{
		ArrayList<TheaterDTO> list = new ArrayList<TheaterDTO>();
		while(rs.next()){
			String theaterCode = rs.getString("theaterCode");
			String theaterName = rs.getString("theaterName");
			String areaCode = rs.getString("areaCode");
			String theaterAddress = rs.getString("theaterAddress");
			if(theaterAddress == null) theaterAddress = "";
			TheaterDTO dto = new TheaterDTO(theaterCode, theaterName, areaCode, theaterAddress);
			list.add(dto);
		}
		int size = list.size();
		TheaterDTO [] arr = new TheaterDTO[size];
		list.toArray(arr);
		return arr;
	}
	
	public TheaterDTO[] select() throws SQLException, NamingException {
		TheaterDTO[] arr = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_THEATER_ALL);
			rs = pstmt.executeQuery();
			
			arr = createArray(rs);
		} finally {
			close();
		}
		return arr;
	}
	
	public TheaterDTO[] selectByCode(String theaterCode) throws SQLException, NamingException{
		int cnt = 0;
		TheaterDTO[] arr = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_THEATER_SELECT);
			pstmt.setString(1, theaterCode);
			rs = pstmt.executeQuery();
			arr = createArray(rs);
			
		} finally {
			close();
		}
		
		return arr;
	}
	
	public int update(String theaterCode, String theaterAddress) throws SQLException, NamingException{
		int cnt = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_THEATER_UPDATE);
			pstmt.setString(1, theaterCode);
			pstmt.setString(2, theaterAddress);
			cnt = pstmt.executeUpdate();
			
		} finally {
			close();
		}
		
		return cnt;
	}	
}


