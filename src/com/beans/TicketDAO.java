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

public class TicketDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	// DAO 객체가 생성될때 Connection도 생성된다.
	public TicketDAO() {
		try {
			Class.forName(D.DRIVER);
			conn = DriverManager.getConnection(D.URL, D.USERID, D.USERPW);
			System.out.println("TicketDAO 객체 생성, 데이터베이스 연결");
			
			
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
	
	public int insert(TicketDTO dto) throws SQLException{
		String movietime = dto.getMovietime();
		int restSeat= dto.getRestSeat();
		int h_uid = dto.getH_uid();
		
		return this.insert(movietime, restSeat, h_uid);
	}
	
	public int insert(String movietime, int restSeat,int h_uid) throws SQLException{
		int cnt = 0 ;
		try {
			pstmt = conn.prepareStatement(D.SQL_TICKET_INSERT);
			pstmt.setString(1, movietime);
			pstmt.setInt(2, restSeat);
			pstmt.setInt(3, h_uid);
			cnt = pstmt.executeUpdate();			
		} finally {
			close();
		}
		return cnt;
	}
	
	public TicketDTO []  createArray(ResultSet rs) throws SQLException{
		ArrayList<TicketDTO> list = new ArrayList<TicketDTO>();
		while(rs.next()){
			int t_uid = rs.getInt("t_uid");
			String movietime = rs.getString("movietime");
			int restSeat = rs.getInt("restSeat");
			int h_uid = rs.getInt("h_uid");			
			TicketDTO dto = new TicketDTO(t_uid, movietime, restSeat, h_uid);
			list.add(dto);
		}
		int size = list.size();
		TicketDTO [] arr = new TicketDTO[size];
		list.toArray(arr);
		return arr;
	}
	
	public HandTDTO []  createTicketArray(ResultSet rs) throws SQLException{
		ArrayList<HandTDTO> list = new ArrayList<HandTDTO>();
		while(rs.next()){
			int h_uid = rs.getInt("h_uid");
			String hallType = rs.getString("hallType");
			String hallLocation = rs.getString("hallLocation");
			String hallSize = rs.getString("hallSize");
			String theaterCode = rs.getString("theaterCode");
			String h_movie = rs.getString("h_movie");
			int t_uid = rs.getInt("t_uid");
			String movietime = rs.getString("movietime");
			int restSeat = rs.getInt("restSeat");
			
			HandTDTO dto = new HandTDTO(h_uid, hallType, hallLocation
					, hallSize, theaterCode, h_movie, t_uid, movietime, restSeat);
			list.add(dto);
		}
		int size = list.size();
		HandTDTO [] arr = new HandTDTO[size];
		list.toArray(arr);
		return arr;
	}
	
	public HandTDTO[] selectByCode(int ticket_uid) throws SQLException{
		int cnt = 0;
		HandTDTO[] arr = null;
		try {
			pstmt = conn.prepareStatement(D.SQL_TICKET_SELECT);
			pstmt.setInt(1, ticket_uid);
			rs = pstmt.executeQuery();
			arr = createTicketArray(rs);
			
		} finally {
			close();
		}
		
		return arr;
	}
}
