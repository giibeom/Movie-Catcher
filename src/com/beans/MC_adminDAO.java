package com.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.D;

public class MC_adminDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	public MC_adminDAO() {
		conn = ConnectionDAO.getConnection();
	}
	
	// DB 자원 반납 메소드
	public void close() throws SQLException{
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
	public int insert(MC_adminDTO dto) throws SQLException {
		int a_uid = dto.getA_uid();
		String a_id = dto.getA_id();
		String a_pw = dto.getA_pw();
		String a_regdate = dto.getA_regdate();
		
		return this.insert(a_id, a_pw);
	}
	
	public int insert(String a_id, String a_pw) throws SQLException {
		int cnt = 0;
	
		try {
			pstmt = conn.prepareStatement(D.SQL_MC_ADMIN_INSERT);
			pstmt.setString(1, a_id);
			pstmt.setString(2, a_pw);
			cnt = pstmt.executeUpdate();
		}finally {
			close();
		}
		
		return cnt;
	}
	
	public int delete(int a_id) throws SQLException {
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(D.SQL_MC_ADMIN_DELETE);
			pstmt.setInt(1, a_id);
			cnt = pstmt.executeUpdate();
		}finally {
			close();
		}
		
		return cnt;
	}
}









