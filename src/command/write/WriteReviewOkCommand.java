package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;

public class WriteReviewOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int cnt = 0;
		String rv_title = request.getParameter("rv_title");
		String rv_content = request.getParameter("rv_content");
		Double rv_star = Double.parseDouble(request.getParameter("rv_star"));
		String rv_id =request.getParameter("rv_id");
		int rs_num =Integer.parseInt(request.getParameter("rs_num"));
		ReviewDAO dao = new ReviewDAO();
		try {
			cnt = dao.insertUser(rv_title, rv_content, rv_star, rs_num, rv_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		request.setAttribute("result", cnt);
	}

}
