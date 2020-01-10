package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReserveDAO;
import com.beans.ReserveDTO;

public class ReserveUserCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		ReserveDAO dao = new ReserveDAO();
		ReserveDTO [] arr = null;
		
		int u_idnum = Integer.parseInt(request.getParameter("u_idnum"));
		
		try {
			arr = dao.getUserRs(u_idnum);
			request.setAttribute("list", arr);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
