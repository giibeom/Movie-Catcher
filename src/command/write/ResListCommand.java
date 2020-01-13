package command.write;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.HandTDTO;
import com.beans.MC_userDAO;
import com.beans.MC_userDTO;
import com.beans.ReserveDAO;
import com.beans.ReserveDTO;
import com.beans.TicketDAO;
import com.beans.TicketDTO;

public class ResListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		ReserveDAO rdao = new ReserveDAO();
		MC_userDAO udao = new MC_userDAO();
		TicketDAO tdao = new TicketDAO();
		MC_userDTO[] uarr = null;
		ReserveDTO[] rarr = null;
		HandTDTO[][] tarr = null;
		
		String u_id = request.getParameter("u_id");
		try {
			uarr = udao.select(u_id);
			int u_idnum = uarr[0].getU_idnum();
			rarr = rdao.getUserRs(u_idnum);
			tarr = new HandTDTO[rarr.length][];
			for(int i = 0; i < rarr.length; i++) {
				int t_uid = rarr[i].getT_uid();
				tarr[i] = tdao.selectByCode(t_uid);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", rarr);
		request.setAttribute("ticket", tarr);
	}

}
