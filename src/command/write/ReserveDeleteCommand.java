package command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReserveDAO;

public class ReserveDeleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int cnt  = 0;
		ReserveDAO dao  = new ReserveDAO();
		
		int rs_num = Integer.parseInt(request.getParameter("rs_num"));
		try {
			cnt = dao.delete(rs_num);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("result", cnt);
		request.setAttribute("rs_num", rs_num);
	}

}
