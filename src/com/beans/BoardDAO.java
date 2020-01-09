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

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import common.D;

public class BoardDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	public BoardDAO() {}
	
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
	
	public int insert(BoardDTO dto) throws SQLException, NamingException {
		String b_title = dto.getB_title();
		String b_content = dto.getB_content();
		int b_uid = dto.getA_uid();
		
		return this.insert(b_title, b_content, b_uid);
	}
	
	public int insert(String b_title, String b_content, int b_uid) throws SQLException, NamingException{
		int cnt = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_BOARD_INSERT);
			pstmt.setString(1, b_title);
			pstmt.setString(2, b_content);
			pstmt.setInt(3, b_uid);
			cnt = pstmt.executeUpdate();
		} finally {
			close();
		}
		return cnt;
	}
	
	/*"UPDATE board SET b_title = ?, b_content = ? WHERE b_num = ?";*/
	public int update(String b_title, String b_content, int b_num) throws SQLException, NamingException{
		int cnt = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_BOARD_UPDATE);
			pstmt.setString(1, b_title);
			pstmt.setString(2, b_content);
			pstmt.setInt(3, b_num);
			cnt = pstmt.executeUpdate();
		}finally {
			close();
		}
		
		return cnt;
	}
	
	public int delete(int b_num) throws SQLException, NamingException {
		int cnt = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_BOARD_DELETE);
			pstmt.setInt(1, b_num);
			cnt = pstmt.executeUpdate();
			
		}finally {
			close();
		}
		
		return cnt;
		
	}
	
	public BoardDTO [] createArray(ResultSet rs) throws SQLException {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		while(rs.next()) {
			int b_num = rs.getInt("b_num");
			String b_title = rs.getString("b_title");
			String b_content = rs.getString("b_content");
			int a_uid = rs.getInt("a_uid");
			Date d = rs.getDate("b_regdate");
			Time t = rs.getTime("b_regdate");
			String b_regdate = new SimpleDateFormat("yyyy-MM-dd").format(d) + " "
					+ new SimpleDateFormat("hh:mm:ss").format(t);
			
			BoardDTO dto = new BoardDTO(b_num, b_title, b_content, a_uid);
			list.add(dto);
		}
		int size = list.size();
		BoardDTO [] arr = new BoardDTO[size];
		list.toArray(arr);
		return arr;
		
	}
	
	public BoardDTO [] select() throws SQLException, NamingException {
		BoardDTO [] arr = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_BOARD_SELECT);
			rs = pstmt.executeQuery();
			arr = createArray(rs);
			
		}finally {
			close();
		}
		
		return arr;
		
	}
}









