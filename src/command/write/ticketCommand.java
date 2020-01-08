package command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.HallDAO;
import com.beans.HandTDTO;
import com.beans.TheaterDAO;
import com.beans.TheaterDTO;

public class ticketCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HallDAO hdao = new HallDAO();
		HandTDTO [] harr = null;
		String theaterCode = request.getParameter("theaterCode");
		try {
			harr = hdao.selectTicket(theaterCode);
			request.setAttribute("ticket", harr);
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
