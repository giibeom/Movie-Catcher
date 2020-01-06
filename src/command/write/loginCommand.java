package command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.MC_userDAO;
import com.beans.MC_userDTO;

public class loginCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String userPw = "";
		int cnt = 0;
		MC_userDAO dao = new MC_userDAO();
		
		//입력한 값 받아오기
		String id = request.getParameter("uname");
		String pw = request.getParameter("psw");
		
		
		//parameter 유효성 검증 뒤에 try 시도
		if(id != null && pw != null && id.trim().length() > 0 && pw.trim().length() > 0) {
			try {
				userPw = dao.password(id);
			} catch(SQLException e) {
				e.printStackTrace();
			} 
		}
		if(userPw.equals(pw)) {
			cnt = 1;
		}
		request.setAttribute("result", cnt);
		request.setAttribute("id", id);
	}

}
