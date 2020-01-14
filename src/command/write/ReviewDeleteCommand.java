package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;
import com.beans.ReviewDTO;

public class ReviewDeleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		ReviewDTO[] arr = null;
		ReviewDAO dao = new ReviewDAO();
		String rv_id = request.getParameter("rv_id");
		try {
			arr = dao.selectUser(rv_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", arr);

	}

}
