package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.MC_userDAO;

public class MpUserUpdateCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int cnt = 0;
		MC_userDAO dao = new MC_userDAO();
		
		String u_id = request.getParameter("id");
		String u_pw = request.getParameter("pw");
		String u_name = request.getParameter("nick");
		if(u_name == null || u_name.trim().length() == 0) u_name = "";
		String u_email = request.getParameter("email");
		String u_phone = request.getParameter("phoneNum");
		
		if(u_id != null && u_pw != null && u_id.trim().length() > 0 &&u_pw.trim().length() > 0) {
			try {
				cnt = dao.update(u_name, u_pw, u_email, u_phone, u_id);
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		request.setAttribute("result", cnt);
		request.setAttribute("id", u_id);
		
	}

}
