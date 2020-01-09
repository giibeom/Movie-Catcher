package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.BoardDAO;

public class b_deleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int cnt = 0;
		BoardDAO dao = new BoardDAO();
		
		//입력한 값을 받아오기
		int b_num = Integer.parseInt(request.getParameter("b_num"));
		
		try {			
			cnt = dao.delete(b_num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("result", cnt);
		
	} // end execute()
} // end Command