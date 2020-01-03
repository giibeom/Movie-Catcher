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

public class HallDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	// DAO 객체가 생성될때 Connection도 생성된다.
	public HallDAO() {
		try {
			Class.forName(D.DRIVER);
			conn = DriverManager.getConnection(D.URL, D.USERID, D.USERPW);
			System.out.println("HallDAO 객체 생성, 데이터베이스 연결");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//DB 자원반납 메소드
	public void close() throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
	public int insert(HallDTO dto) throws SQLException{
		String hallType = dto.getHallType();
		String hallLocation = dto.getHallLocation();
		String hallSize = dto.getHallSize();
		String theaterCode = dto.getTheaterCode();
		int m_uid = dto.getM_uid();
		
		return this.insert(hallType, hallLocation, hallSize, theaterCode, m_uid);
	}
	
	public int insert(String hallType, String hallLocation, String hallSize, String theaterCode,int m_uid) throws SQLException{
		int cnt = 0 ;
		try {
			pstmt = conn.prepareStatement(D.SQL_HALL_INSERT);
			pstmt.setString(1, hallType);
			pstmt.setString(2, hallLocation);
			pstmt.setString(3, hallSize);
			pstmt.setString(4, theaterCode);
			pstmt.setInt(5, m_uid);
			cnt = pstmt.executeUpdate();			
		} finally {
			close();
		}
		return cnt;
	}
	
	public HallDTO []  createArray(ResultSet rs) throws SQLException{
		ArrayList<HallDTO> list = new ArrayList<HallDTO>();
		while(rs.next()){
			int h_uid = rs.getInt("h_uid");
			String hallType = rs.getString("hallType");
			String hallLocation = rs.getString("hallLocation");
			String hallSize = rs.getString("hallSize");
			String theaterCode = rs.getString("theaterCode");
			int m_uid = rs.getInt("m_uid");
			HallDTO dto = new HallDTO(h_uid, hallType, hallLocation, hallSize, theaterCode, m_uid);
			list.add(dto);
		}
		int size = list.size();
		HallDTO [] arr = new HallDTO[size];
		list.toArray(arr);
		return arr;
	}
	
	public HallDTO[] selectByCode(int h_uid) throws SQLException{
		int cnt = 0;
		HallDTO[] arr = null;
		try {
			pstmt = conn.prepareStatement(D.SQL_HALL_SELECT);
			pstmt.setInt(1, h_uid);
			rs = pstmt.executeQuery();
			arr = createArray(rs);
			
		} finally {
			close();
		}
		
		return arr;
	}
}
