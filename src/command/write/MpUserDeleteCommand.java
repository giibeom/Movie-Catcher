package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.MC_userDAO;

public class MpUserDeleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int cnt = 0;
		MC_userDAO dao = new MC_userDAO();
		String u_id = request.getParameter("u_id");
		try {
			cnt = dao.delete(u_id);
			System.out.println(u_id);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("result", cnt);
		request.setAttribute("u_id", u_id);
	}

}
