package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;
import com.beans.ReviewDTO;

public class MypageReviewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		String u_id = request.getParameter("u_id");
		ReviewDAO dao = new ReviewDAO();
		ReviewDTO[] arr = null;
		try {
			arr = dao.selectUser(u_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", arr);
	}

}
