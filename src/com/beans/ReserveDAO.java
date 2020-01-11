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

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ReserveDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	public ReserveDAO() {}
	
	public static Connection getConnection() throws NamingException, SQLException {
		Context initContext = new InitialContext();
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/testDB");
		return ds.getConnection();
	}
	
	
	// DB 자원 반납 메소드 
	public void close() throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
	public int insert(ReserveDTO dto) throws SQLException, NamingException {
		int rs_price = dto.getRs_price();
		String rs_seat = dto.getRs_seat();
		int u_idnum = dto.getU_idnum();
		int t_uid = dto.getT_uid();
		return this.insert(rs_price, rs_seat, u_idnum, t_uid);
	}
	
	public int insert(int rs_price, String rs_seat, int u_idnum, int t_uid) throws SQLException, NamingException{
		int cnt = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_RESERVE_INSERT);
			pstmt.setInt(1, rs_price);
			pstmt.setString(2, rs_seat);
			pstmt.setInt(3, u_idnum);
			pstmt.setInt(4, t_uid);
			cnt = pstmt.executeUpdate();
		} finally {
			close();
		}
		return cnt;
	}
	
	public ReserveDTO [] createArray(ResultSet rs) throws SQLException {
		ArrayList<ReserveDTO> list = new ArrayList<ReserveDTO>();
		
		while(rs.next()) {
			
			int rs_num = rs.getInt("rs_num");
			String rs_date = rs.getString("rs_date");
			int rs_price = rs.getInt("rs_price");
			String rs_seat = rs.getString("rs_seat");
			int u_idnum = rs.getInt("u_idnum");
			int t_uid = rs.getInt("t_uid");
			
			
			ReserveDTO dto = new ReserveDTO(rs_num, rs_date, rs_price, rs_seat, u_idnum, t_uid);
			list.add(dto);
		}
		int size = list.size();
		ReserveDTO [] arr = new ReserveDTO[size];
		list.toArray(arr);
		return arr;
		
	}
	
	public ReserveDTO [] getUserRs(int u_idnum) throws SQLException, NamingException {
		ReserveDTO [] arr = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_RESERVE_USER);
			pstmt.setInt(1, u_idnum);
			rs = pstmt.executeQuery();
			arr = createArray(rs);
			
		}finally {
			close();
		}
		
		return arr;
		
	}
	
	public ReserveDTO [] get(int rs_num) throws SQLException, NamingException {
		ReserveDTO [] arr = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_RESERVE_REVIEW);
			pstmt.setInt(1, rs_num);
			rs = pstmt.executeQuery();
			arr = createArray(rs);
			
		}finally {
			close();
		}
		
		return arr;
		
	}
	
	public int delete(int rs_num) throws SQLException, NamingException {
		int cnt = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_RESERVE_DELETE);
			pstmt.setInt(1, rs_num);
			cnt = pstmt.executeUpdate();
			
		}finally {
			close();
		}
		
		return cnt;
		
	}
}
