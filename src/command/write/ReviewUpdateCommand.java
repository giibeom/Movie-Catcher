package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;

public class ReviewUpdateCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int cnt = 0;
		
		ReviewDAO dao = new ReviewDAO();
		
		int rv_num = Integer.parseInt(request.getParameter("rv_num"));
		String rv_title = request.getParameter("title");
		String rv_content = request.getParameter("content");
		Double rv_star = Double.parseDouble(request.getParameter("star"));
		if(rv_star == null) rv_star = 0.0;
		
		
		if(rv_title != null && rv_content != null && rv_title.trim().length() > 0 && rv_content.trim().length() >0 ) {
			try {
				cnt = dao.update(rv_title, rv_content, rv_star, rv_num);
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
