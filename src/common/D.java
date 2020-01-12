package common;

public interface D {
	public static final String DRIVER = "org.mariadb.jdbc.Driver";
	public static final String URL = "jdbc:mariadb://localhost:3306/movie_catcher";
	public static final String USERID = "root";
	public static final String USERPW = "1234";
	
	// 게시글 관련 쿼리문
	public static final String SQL_MC_USER_INSERT = "INSERT INTO mc_user (u_id, u_pw, u_name, u_email, u_phone, u_date) VALUES (?, ?, ?, ?, ?, ?)";
	public static final String SQL_MC_USER_PASSWORD = "SELECT u_pw FROM mc_user WHERE u_id = ?";
	public static final String SQL_MC_USER_SELECT = "SELECT * FROM mc_user WHERE u_id = ?";
	public static final String SQL_MC_USER_UPDATE = "UPDATE mc_user SET u_name = ?, u_pw = ?,  u_email = ?, u_phone = ? where u_id = ?";
	public static final String SQL_MC_USER_DELETE = "DELETE FROM mc_user WHERE u_id = ?";
	
	
	public static final String SQL_MC_ADMIN_INSERT = "INSERT INTO mc_admin(a_id, a_pw) VALUES (?, ?)";
	public static final String SQL_MC_ADMIN_DELETE = "DELETE FROM mc_admin WHERE a_id = ?";
	
	public static final String SQL_BOARD_INSERT = "INSERT INTO board (b_title, b_content, a_uid) VALUES (?, ?, ?)";
	public static final String SQL_BOARD_UPDATE = "UPDATE board SET b_title = ?, b_content = ? WHERE b_num = ?";
	public static final String SQL_BOARD_SELECT = "SELECT * FROM board";
	public static final String SQL_BOARD_DELETE = "DELETE FROM board WHERE b_num = ?";
	
	public static final String SQL_THEATER_INSERT = "INSERT INTO theater (theaterCode, theaterName, AreaCode, theaterAddress) VALUES (?, ?, ?, ?)";
	public static final String SQL_THEATER_ALL = "SELECT * FROM theater";
	public static final String SQL_THEATER_SELECT = "SELECT * FROM theater WHERE theaterCode = ?";
	public static final String SQL_THEATER_UPDATE = "UPDATE theater SET theaterAddress = ? WHERE theaterCode = ?";
	
	public static final String SQL_HALL_INSERT = "INSERT INTO hall (hallType, hallLocation, hallSize, theaterCode, h_movie, h_grade) VALUES (?, ?, ?, ?, ?, ?)";
	public static final String SQL_HALL_SIZE = "SELECT count(*) FROM hall";
	public static final String SQL_HALL_SELECTALL = "SELECT * FROM hall h, ticket t WHERE h.h_uid = t.h_uid";
	public static final String SQL_HALL_TICKET = "SELECT * FROM hall h, ticket t WHERE h.h_uid = t.h_uid AND theaterCode = ?";
	public static final String SQL_HALL_SELECT = "SELECT * FROM hall WHERE h_uid = ?";
	
	public static final String SQL_TICKET_INSERT = "INSERT INTO ticket (movietime, restSeat, h_uid) VALUES (?, ?, ?)";
	public static final String SQL_TICKET_SELECT = "SELECT * FROM hall h, ticket t WHERE h.h_uid = t.h_uid AND t.t_uid = ?";
	
	public static final String SQL_RESERVE_INSERT = "INSERT INTO reserve (rs_price, rs_seat, u_idnum, t_uid) VALUES(?, ?, ?, ?)"; 
	public static final String SQL_RESERVE_USER = "SELECT * FROM reserve WHERE u_idnum = ?";
	public static final String SQL_RESERVE_REVIEW = "SELECT * FROM reserve WHERE rs_num = ?";
	public static final String SQL_RESERVE_DELETE = "DELETE FROM reserve WHERE rs_num = ?";
	
	public static final String SQL_REVIEW_INSERT = "INSERT INTO review (rv_title, rv_content, rv_star, rs_num, rv_id, rv_date) VALUES (?, ?, ?, ?, ?, ?)";
	public static final String SQL_REVIEW_USER = "INSERT INTO review (rv_title, rv_content, rv_star, rs_num, rv_id) VALUES (?, ?, ?, ?, ?)";
	public static final String SQL_REVIEW_SELECT = "SELECT * FROM review";
	public static final String SQL_REVIEW_SELECT_USER = "SELECT * FROM review where rv_id = ?";
	public static final String SQL_REVIEW_DELETE = "DELETE FROM review WHERE rv_num=?";
	

	
	// 페이징용 쿼리 준비
	// 쿼리: 글 목록 전체 개수 가져오기
	public static final String SQL_REVIEW_COUNT_ALL = 
			"SELECT COUNT(*) FROM review";
	
	// 쿼리: from 부터 row 만큼 SELECT : LIMIT 은 0 부터 시작 주의!
	public static final  String SQL_REVIEW_SELECT_FROM_ROW = 
			"SELECT * FROM review ORDER BY rv_num DESC LIMIT ?, ?";
	
	// 특정 영화의 리뷰
	public static final String SQL_REVIEW_COUNT_MOVIE = 
			"SELECT COUNT(*) FROM review where rv_title LIKE ?";
	
	public static final  String SQL_REVIEW_SELECT_MOVIE_FROM_ROW = 
			"SELECT * FROM review where rv_title LIKE ? ORDER BY rv_num DESC LIMIT ?, ?";

	
}
