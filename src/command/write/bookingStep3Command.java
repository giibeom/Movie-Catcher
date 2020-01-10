package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.HandTDTO;
import com.beans.TheaterDAO;
import com.beans.TheaterDTO;
import com.beans.TicketDAO;

public class bookingStep3Command implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		TicketDAO dao = new TicketDAO();
		TheaterDAO tdao = new TheaterDAO();
		HandTDTO[] arr = null;
		TheaterDTO[] tarr = null;
		int t_uid = Integer.parseInt(request.getParameter("t_uid"));
		try {
			arr = dao.selectByCode(t_uid);
			String theaterCode = arr[0].getTheaterCode();
			tarr = tdao.selectByCode(theaterCode);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", arr);
		request.setAttribute("theater", tarr);
	}	

}
