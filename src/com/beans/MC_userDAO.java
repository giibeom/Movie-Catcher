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

public class MC_userDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	// DAO 객체가 생성될때 Connection도 생성된다.
	public MC_userDAO() {

		conn = ConnectionDAO.getConnection();

		try {
			Class.forName(D.DRIVER);
			conn = DriverManager.getConnection(D.URL, D.USERID, D.USERPW);
			System.out.println("MC_userDAO 객체 생성, 데이터베이스 연결");
			
			
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
	
	public int insert(MC_userDTO dto) throws SQLException {
		
		int u_idnum = dto.getU_idnum();
		String u_id = dto.getU_id();
		String u_pw = dto.getU_pw();
		String u_name = dto.getU_name();
		String u_email = dto.getU_email();
		String u_phone = dto.getU_phone();
		String u_regdate = dto.getU_regdate();
		String u_date = dto.getU_date();
		
		return this.insert(u_id, u_pw, u_name, u_email, u_phone, u_date);
		
	}
	
	public int insert(String u_id, String u_pw, String u_name, String u_email, String u_phone, String u_date) throws SQLException {
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(D.SQL_MC_USER_INSERT);
			pstmt.setString(1, u_id);
			pstmt.setString(2, u_pw);
			pstmt.setString(3, u_name);
			pstmt.setString(4, u_email);
			pstmt.setString(5, u_phone);
			pstmt.setString(6, u_date);
			
			cnt = pstmt.executeUpdate();
		}finally {
			close();
		}
		
		return cnt;
	}
	
	public int update(String u_pw, String u_email, String u_phone, String u_id ) throws SQLException {
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(D.SQL_MC_USER_UPDATE);
			pstmt.setString(1, u_pw);
			pstmt.setString(2, u_email);
			pstmt.setString(3, u_phone);
			pstmt.setString(4, u_id);
			
			cnt = pstmt.executeUpdate();
		}finally {
			close();
		}
		
		return cnt;
	}
	
	public int delete(String u_id) throws SQLException {
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(D.SQL_MC_USER_DELETE);
			pstmt.setString(1, u_id);
			cnt = pstmt.executeUpdate();
		}finally {
			close();
		}
		
		return cnt;
	}
	
	public MC_userDTO [] createArray(ResultSet rs) throws SQLException {
		ArrayList<MC_userDTO> list = new ArrayList<MC_userDTO>();
		
		while(rs.next()) {
			int u_idnum = rs.getInt("u_idnum");
			String u_id = rs.getString("u_id");
			String u_pw = rs.getString("u_pw");
			String u_name = rs.getString("u_name");
			String u_email = rs.getString("u_email");
			String u_phone = rs.getString("u_phone");
			String u_date = rs.getString("u_date");
			
			Date d = rs.getDate("u_regdate");
			Time t = rs.getTime("u_regdate");
			String u_regdate = new SimpleDateFormat("yyyy-MM-dd").format(d) + " " 
					+ new SimpleDateFormat("hh:mm:ss").format(t);
			
			MC_userDTO dto = new MC_userDTO(u_idnum, u_id, u_pw, u_name, u_email, u_phone, u_date, u_regdate );
			list.add(dto);
		}
		int size = list.size();
		MC_userDTO [] arr = new MC_userDTO[size];
		list.toArray(arr);
		return arr;
	}
	
	public MC_userDTO [] select(String u_id) throws SQLException {
		MC_userDTO [] arr = null;
		
		try {
			pstmt = conn.prepareStatement(D.SQL_MC_USER_SELECT);
			pstmt.setString(1, u_id);
			rs = pstmt.executeQuery();
			
		}finally {
			close();
		}
		
		
		return arr;
	}
	
	
	public String password(String u_id) throws SQLException {
		String pw = null;
		
		
		try {
			pstmt = conn.prepareStatement(D.SQL_MC_USER_PASSWORD);
			pstmt.setString(1, u_id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				pw = rs.getString("u_pw");
			}else {
				pw = "";	
			}

			
		}finally {
			close();
		}
		return pw; 
	}
}















