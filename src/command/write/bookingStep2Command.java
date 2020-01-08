package command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.HandTDTO;
import com.beans.TicketDAO;

public class bookingStep2Command implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		TicketDAO dao = new TicketDAO();
		HandTDTO[] arr = null;
		int t_uid = Integer.parseInt(request.getParameter("t_uid"));
		try {
			arr = dao.selectByCode(t_uid);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", arr);
		
	}

}
