package command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.MC_userDAO;
import com.beans.MC_userDTO;

public class MpUserViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MC_userDAO dao = new MC_userDAO();
		
		MC_userDTO [] arr = null;
		
		String u_id = request.getParameter("id");
		
		try {
			arr = dao.select(u_id);
			request.setAttribute("list", arr);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
