package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;
import com.beans.ReviewDTO;

public class MpReviewViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		ReviewDAO dao = new ReviewDAO();
		
		ReviewDTO [] arr = null;
		
		String rv_id = request.getParameter("rv_id");
		try {
			arr = dao.selectUser(rv_id);
			request.setAttribute("list", arr);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
