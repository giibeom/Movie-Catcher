package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.MC_userDAO;
import com.beans.MC_userDTO;
import com.beans.ReserveDAO;

public class ReserveOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int cnt = 0;
		ReserveDAO rdao = new ReserveDAO();
		MC_userDAO udao = new MC_userDAO();
		MC_userDTO[] arr = null;
		
		int rs_price = Integer.parseInt(request.getParameter("price"));
		String rs_seat = request.getParameter("seats");
		String u_id = request.getParameter("u_id");
		int t_uid = Integer.parseInt(request.getParameter("t_uid"));
		
		try {
			arr = udao.select(u_id);
			int u_idnum = arr[0].getU_idnum();
			cnt = rdao.insert(rs_price, rs_seat, u_idnum, t_uid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("result", cnt);
		request.setAttribute("u_id", u_id);
		
		
	}

}
