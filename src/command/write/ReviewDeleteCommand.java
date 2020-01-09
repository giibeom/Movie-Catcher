package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;

public class ReviewDeleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int cnt = 0;
		
		ReviewDAO dao = new ReviewDAO();
		
		int rv_num = Integer.parseInt(request.getParameter("num"));
		
		try {
			cnt = dao.delete(rv_num);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("result", cnt);
		request.setAttribute("num", rv_num);
	}

}
