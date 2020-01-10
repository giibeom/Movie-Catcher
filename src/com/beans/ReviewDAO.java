package com.beans;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import common.D;

public class ReviewDAO {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	// DAO 객체가 생성될때 Connection도 생성된다.
	public ReviewDAO() {}
	
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
	
	public int insert(ReviewDTO dto) throws SQLException, NamingException{
		String rv_title = dto.getRv_title();
		String rv_content = dto.getRv_content();
		Double rv_star = dto.getRv_star();
		int rs_num = dto.getRs_num();	
		int rv_num = dto.getRv_num();
		String rv_id = dto.getRv_id();
		String rv_date = dto.getRv_date();

		return this.insert(rv_title, rv_content, rv_star, rs_num, rv_id, rv_date);
	}
	
	public int insert(String rv_title, String rv_content, Double rv_star, int rs_num, String rv_id, String rv_date) throws SQLException, NamingException{
		int cnt = 0 ;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_REVIEW_INSERT);
			pstmt.setString(1, rv_title);
			pstmt.setString(2, rv_content);
			pstmt.setDouble(3, rv_star);
			pstmt.setInt(4, rs_num);
			pstmt.setString(5, rv_id);
			pstmt.setString(6, rv_date);
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
			String rv_id = rs.getString("rv_id");
			Date d = rs.getDate("rv_date");
			String rv_date = new SimpleDateFormat("yyyy-MM-dd").format(d);
			
			
			ReviewDTO dto = new ReviewDTO(rv_title, rv_content, rv_star, rs_num, rv_id, rv_date);
			list.add(dto);
		} 
		int size = list.size();
		ReviewDTO [] arr = new ReviewDTO[size];
		list.toArray(arr);
		return arr;
	}
	
	public ReviewDTO[] select() throws SQLException, NamingException {
		ReviewDTO[] arr = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_REVIEW_SELECT);
			rs = pstmt.executeQuery();
			
			arr = createArray(rs);
		} finally {
			close();
		}
		return arr;
	}
	
	public int delete(int rv_num) throws SQLException, NamingException {
		int cnt = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(D.SQL_REVIEW_DELETE);
			pstmt.setInt(1, rv_num);
			cnt = pstmt.executeUpdate();
			
		}finally {
			close();
		}
		
		return cnt;
		
	}
	
	// 페이징
		// 몇번째 from 부터 몇개 rows를 SELECT 
		public ReviewDTO [] selectFromRow(int from, int rows) throws SQLException, NamingException {
			ReviewDTO [] arr = null;
			
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(D.SQL_REVIEW_SELECT_FROM_ROW);
				pstmt.setInt(1, from);
				pstmt.setInt(2, rows);
				rs = pstmt.executeQuery();
				arr = createArray(rs);
				
			} finally { 
				close();
			}
			return arr;
		}
		
		// 총 몇개의 글이 있는지 계산
			public int countAll() throws SQLException, NamingException {
				int cnt = 0;
				try {
					
					conn = getConnection();
					pstmt = conn.prepareStatement(D.SQL_REVIEW_COUNT_ALL);
					rs = pstmt.executeQuery();
					rs.next();
					cnt = rs.getInt(1); //첫번째 컬럼
					
				} finally {
					close();
				}
				return cnt;
			}
			
			
			// 특정 영화의 리뷰
			
			public ReviewDTO [] selectFromRow(int from, int rows, String movieName) throws SQLException, NamingException {
				ReviewDTO [] arr = null;
				
				try {
					conn = getConnection();
					pstmt = conn.prepareStatement(D.SQL_REVIEW_SELECT_MOVIE_FROM_ROW);
					pstmt.setString(1, movieName);
					pstmt.setInt(2, from);
					pstmt.setInt(3, rows);
					rs = pstmt.executeQuery();
					arr = createArray(rs);
					
				} finally { 
					close();
				}
				return arr;
			}
			
			// 총 몇개의 글이 있는지 계산
				public int countMovie(String movieName) throws SQLException, NamingException {
					int cnt = 0;
					try {
						
						conn = getConnection();
						pstmt = conn.prepareStatement(D.SQL_REVIEW_COUNT_MOVIE);
						pstmt.setString(1, movieName);
						rs = pstmt.executeQuery();
						rs.next();
						cnt = rs.getInt(1); //첫번째 컬럼
						
					} finally {
						close();
					}
					return cnt;
				}
			
			
			
			
			
	
	
}
