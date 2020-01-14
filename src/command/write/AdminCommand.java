package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.BoardDAO;
import com.beans.BoardDTO;
import com.beans.MC_userDAO;
import com.beans.MC_userDTO;

public class AdminCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {

		BoardDAO b_dao = new BoardDAO();
		BoardDTO [] b_arr = null;
		
		
		/* 전체 공지사항 */
		try {
			b_arr = b_dao.select();
			request.setAttribute("listb", b_arr);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		/* 전체 회원 */
		MC_userDAO m_dao = new MC_userDAO();
		MC_userDTO [] m_arr = null;
		
		try {
			m_arr = m_dao.selectUser();
			request.setAttribute("listm", m_arr);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}

}
