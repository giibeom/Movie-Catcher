package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;
import com.beans.ReviewDTO;

public class Mv_infoCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		ReviewDTO[] arr = null;
		ReviewDAO rdao = new ReviewDAO();
		String movieName = request.getParameter("movieName");
		try {
			arr = rdao.selectFromRow(0, 2, movieName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", arr);
	}

}
