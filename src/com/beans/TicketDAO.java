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
		conn = ConnectionDAO.getConnection();
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
	
	public TicketDTO[] selectByCode(int ticket_uid) throws SQLException{
		int cnt = 0;
		TicketDTO[] arr = null;
		try {
			pstmt = conn.prepareStatement(D.SQL_TICKET_SELECT);
			pstmt.setInt(1, ticket_uid);
			rs = pstmt.executeQuery();
			arr = createArray(rs);
			
		} finally {
			close();
		}
		
		return arr;
	}
}
