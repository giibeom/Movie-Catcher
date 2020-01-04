package com.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.D;

public class ReviewDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	// DAO 객체가 생성될때 Connection도 생성된다.
	public ReviewDAO() {
		try {
			Class.forName(D.DRIVER);
			conn = DriverManager.getConnection(D.URL, D.USERID, D.USERPW);
			System.out.println("ReviewDAO 객체 생성, 데이터베이스 연결");
			
			
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
	
	public int insert(ReviewDTO dto) throws SQLException{
		String rv_title = dto.getRv_title();
		String rv_content = dto.getRv_content();
		Double rv_star = dto.getRv_star();
		int rs_num = dto.getRs_num();	
		
		return this.insert(rv_title, rv_content, rv_star, rs_num);
	}
	
	public int insert(String rv_title, String rv_content, Double rv_star, int rs_num) throws SQLException{
		int cnt = 0 ;
		try {
			pstmt = conn.prepareStatement(D.SQL_REVIEW_INSERT);
			pstmt.setString(1, rv_title);
			pstmt.setString(2, rv_content);
			pstmt.setDouble(3, rv_star);
			pstmt.setInt(4, rs_num);
			cnt = pstmt.executeUpdate();			
		} finally {
			close();
		}
		return cnt;
	}
	
	public ReviewDTO []  createArray(ResultSet rs) throws SQLException{
		ArrayList<ReviewDTO> list = new ArrayList<ReviewDTO>();
		while(rs.next()){
			int rv_num = rs.getInt("rv_num");
			String rv_title = rs.getString("rv_title");
			String rv_content = rs.getString("rv_content");
			Double rv_star = rs.getDouble("rv_star");
			int rs_num = rs.getInt("rs_num");
			ReviewDTO dto = new ReviewDTO(rv_num, rv_title, rv_content, rv_star, rs_num);
			list.add(dto);
		}
		int size = list.size();
		ReviewDTO [] arr = new ReviewDTO[size];
		list.toArray(arr);
		return arr;
	}
	
	public ReviewDTO[] select() throws SQLException {
		ReviewDTO[] arr = null;
		try {
			pstmt = conn.prepareStatement(D.SQL_REVIEW_SELECT);
			rs = pstmt.executeQuery();
			
			arr = createArray(rs);
		} finally {
			close();
		}
		return arr;
	}
	
	public int update(String rv_title , String rv_content , Double rv_star , int rv_num ) throws SQLException{
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(D.SQL_REVIEW_UPDATE);
			pstmt.setString(1, rv_title);
			pstmt.setString(2, rv_content);
			pstmt.setDouble(3, rv_star);
			pstmt.setInt(4, rv_num);
			cnt = pstmt.executeUpdate();
			
		} finally {
			close();
		}
		
		return cnt;
	}
	
	public int delete(int rv_num) throws SQLException {
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(D.SQL_REVIEW_DELETE);
			pstmt.setInt(1, rv_num);
			cnt = pstmt.executeUpdate();
			
		}finally {
			close();
		}
		
		return cnt;
		
	}
}
