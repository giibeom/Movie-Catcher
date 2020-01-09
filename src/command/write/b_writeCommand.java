package command.write;

import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.BoardDAO;

public class b_writeCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		
		int cnt = 0;
		BoardDAO dao = new BoardDAO();
		
		
		String b_title = request.getParameter("b_title");
		String b_content = request.getParameter("b_content");
		//int b_uid = Integer.parseInt(request.getParameter("uid"));
		int b_uid = 1;
		
		
		if (b_title != null && b_content != null && b_title.trim().length() > 0 
				&& b_content.trim().length() >0) {
		try {
			cnt = dao.insert(b_title, b_content, b_uid);
		}catch (SQLException e){
			e.printStackTrace();
			}
		}
		request.setAttribute("result", cnt);
	}
}
