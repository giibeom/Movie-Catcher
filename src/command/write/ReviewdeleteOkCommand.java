package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;
import com.beans.ReviewDTO;

public class ReviewdeleteOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int rv_num = Integer.parseInt(request.getParameter("rv_num"));
		ReviewDAO dao = new ReviewDAO();
		int cnt = 0;
		try {
			cnt = dao.delete(rv_num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("result", cnt);
	}

}
