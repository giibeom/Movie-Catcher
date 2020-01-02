package common;

public interface D {
	public static final String DRIVER = "org.mariadb.jdbc.Driver";
	public static final String URL = "jdbc:mariadb://localhost:3306/movie_catcher";
	public static final String USERID = "myuser";
	public static final String USERPW = "1234";
	
	// 게시글 관련 쿼리문
	public static final String SQL_MC_USER_INSERT = "INSERT INTO mc_user (u_id, u_pw, u_name, u_email, u_phone, u_date) VALUES (?, ?, ?, ?, ?, ?)";
	public static final String SQL_MC_USER_PASSWORD = "SELECT u_pw FROM mc_user WHERE u_id = ?";
	public static final String SQL_MC_USER_SELECT = "SELECT * FROM mc_user WHERE u_id = ?";
	public static final String SQL_MC_USER_UPDATE = "UPDATE mc_user SET u_pw = ?,  u_email = ?, u_phone = ? where u_id = ?";
	public static final String SQL_MC_USER_DELETE = "DELETE FROM mc_user WHERE u_id = ?";
	
	
	public static final String SQL_MC_ADMIN_INSERT = "INSERT INTO mc_admin(a_id, a_pw) VALUES (?, ?)";
	public static final String SQL_MC_ADMIN_DELETE = "DELETE FROM mc_admin WHERE a_id = ?";
	
	public static final String SQL_BOARD_INSERT = "INSERT INTO board (b_title, b_content, b_regdate, a_uid) VALUES (?, ?, ?, ?)";
	public static final String SQL_BOARD_UPDATE = "UPDATE board SET b_title = ?, b_content = ? WHERE b_num = ?";
	public static final String SQL_BOARD_SELECT = "SELECT * FROM board";
	public static final String SQL_BOARD_DELETE = "DELETE FROM board WHERE b_num = ?";
	
	public static final String SQL_THEATER_INSERT = "INSERT INTO theater (th_TheaterCode, th_name, th_AreaCode) VALUES (?, ?, ?)";
	public static final String SQL_THEATER_ALL = "SELECT * FROM theater";
	public static final String SQL_THEATER_SELECT = "SELECT * FROM theater WHERE th_TheaterCode = ?";
	
	public static final String SQL_MOVIE_INSERT = "INSERT INTO movie (m_name) VALUES (?)";
	public static final String SQL_MOVIE_UPDATE = "UPDATE movie SET m_db_id = ?, m_kobis_id = ? WHERE m_name = ?";
	public static final String SQL_MOVIE_SELECT = "SELECT m_name FROM movie WHERE m_uid = ?";
	
	public static final String SQL_HALL_INSERT = "INSERT INTO hall (hallType, hallLocation, hallSize, theaterCode, m_uid) VALUES (?, ?, ?, ?, ?)";
	public static final String SQL_HALL_SELECT = "SELECT * FROM hall WHERE h_uid = ?";
	
	public static final String SQL_TICKET_INSERT = "INSERT INTO ticket (movietime, restSeat, h_uid) VALUES (?, ?, ?)";
	public static final String SQL_TICKET_SELECT = "SELECT * FROM ticket WHERE ticket_uid = ?";
	
	public static final String SQL_RESERVE_INSERT = "INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES(?, ?, ?, ?, ?)"; 
	public static final String SQL_RESERVE_SELECT = "SELECT * FROM reserve";
	public static final String SQL_RESERVE_REVIEW = "SELECT * FROM reserve WHERE rs_num = ?";
	public static final String SQL_RESERVE_DELETE = "DELETE FROM reserve WHERE rs_num = ?";
	
	public static final String SQL_REVIEW_INSERT = "INSERT INTO review (rv_title, rv_content, rv_star, rs_num) VALUES (?, ?, ?, ?)";
	public static final String SQL_REVIEW_SELECT = "SELECT * FROM review";
	public static final String SQL_REVIEW_UPDATE = "UPDATE review SET rv_title = ?, rv_content = ?, rv_star = ? WHERE rv_num = ?";
	public static final String SQL_REVIEW_DELETE = "DELETE FROM review WHERE rv_num=?";
}
